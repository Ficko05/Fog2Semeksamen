
package PresentationLayer;

import FunctionLayer.Customer;
import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CustomerInfoCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException, OrderException{
        HttpSession session = request.getSession();
        List<Customer> customers;
        customers =LogicFacade.CustomerInfo();
        session.setAttribute("customers", customers);

        Customer customer = null;
        int customerid = Integer.parseInt(request.getParameter("customerid"));
        List<Customer> liste = (List) request.getSession().getAttribute("customers");

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getId() == customerid){
                customer = liste.get(i);
            }
          
        }
        
       session.setAttribute("customerInfo", customer);
        
        
        return "CustomerInfo";    
}
}