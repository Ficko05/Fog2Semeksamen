
package PresentationLayer;

import FunctionLayer.Customer;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShowCustomerOrdersCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException {
                HttpSession session = request.getSession();

        Customer customer = (Customer) request.getSession().getAttribute("customer");
        List<Order> orders;

        orders =LogicFacade.CustomerOrders(customer);
        Comparator<Order> dateComparator = (o1, o2) -> o2.getDate().compareTo(o1.getDate());
        orders.sort(dateComparator);
        session.setAttribute("CustomerOrders", orders);

        return "CustomerOrdreOversigt";


    }

    
    
}
