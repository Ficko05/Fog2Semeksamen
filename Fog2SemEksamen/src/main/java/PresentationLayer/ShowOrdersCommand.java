package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import FunctionLayer.Order;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowOrdersCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException, OrderException {
        List<Order> orders;
        HttpSession session = request.getSession();
        orders =LogicFacade.allOrders();
        session.setAttribute("orders", orders);

        return "OrdreOversigt";
        }
    }