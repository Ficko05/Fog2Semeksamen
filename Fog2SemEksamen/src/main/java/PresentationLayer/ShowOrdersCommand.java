package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import FunctionLayer.Order;
import java.util.Comparator;
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
        Comparator<Order> dateComparator = (o1, o2) -> o2.getId()-(o1.getId());
        orders.sort(dateComparator);
        session.setAttribute("orders", orders);

        return "OrdreOversigt";
        }
    }