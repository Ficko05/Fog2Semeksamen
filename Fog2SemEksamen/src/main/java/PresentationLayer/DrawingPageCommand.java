package PresentationLayer;

import FunctionLayer.Drawer;
import FunctionLayer.Order;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DrawingPageCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException {

        HttpSession session = request.getSession();
        List<Order> liste = (List) request.getSession().getAttribute("CustomerOrders");
        int orderid = Integer.parseInt(request.getParameter("orderid"));
        Order order = null;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getId() == orderid) {
                order = liste.get(i);
            }
        }
        Drawer draw = new Drawer(order);
        String svg = draw.SVG();
        session.setAttribute("svg", svg);
        
       
        return "DrawingPage";
    }

}
