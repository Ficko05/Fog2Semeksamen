package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.OrderException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class showOrderCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException, OrderException {
        User user = (User) request.getSession().getAttribute("user");
        List<Order> orders;
        
        orders =LogicFacade.getOrders(user);
        request.setAttribute("orders", orders);
        
        return "showOrder";
        }
    }


