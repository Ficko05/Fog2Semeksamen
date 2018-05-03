package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import FunctionLayer.Order;
import FunctionLayer.Customer;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowOrdersCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException, OrderException {
        Customer user = (Customer) request.getSession().getAttribute("user");
        List<Order> orders;

        orders =LogicFacade.allOrders();
        request.setAttribute("orders", orders);

        return "OrdreOversigt";
        }
    }