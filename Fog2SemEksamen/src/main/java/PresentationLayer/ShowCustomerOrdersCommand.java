
package PresentationLayer;

import FunctionLayer.Customer;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowCustomerOrdersCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException {
        Customer customer = (Customer) request.getSession().getAttribute("customer");
        List<Order> orders;

        orders =LogicFacade.CustomerOrders(customer);
        request.setAttribute("CustomerOrders", orders);

        return "CustomerOrdreOversigt";


    }

    
    
}
