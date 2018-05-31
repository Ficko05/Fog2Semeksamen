
package PresentationLayer;

import FunctionLayer.Calculator;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.Customer;
import FunctionLayer.Drawer;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CreateOrderCommand extends Command {
   
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderException, ClassNotFoundException {
        HttpSession session = request.getSession();
        int height = Integer.parseInt(request.getParameter("height"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        Order o = new Order(length, width, height);;
        Drawer draw = new Drawer(o);
        String svg = draw.SVG();
        session.setAttribute("svg", svg);
        Customer customer = (Customer) session.getAttribute("customer");

//        int roof_angle = Integer.parseInt(request.getParameter("roof_angle"));
//        int shed_id = Integer.parseInt(request.getParameter("shed_id"));
//        String customer_comment = request.getParameter("roof_id");        
//        String type = request.getParameter("type");
//        User customer = (User) session.getAttribute("customer");
//        int customerId = LogicFacade.customerById( customer );
        
        //customer user = (customer) session.getAttribute("user");
        
        try {
            LogicFacade.createOrder(o, customer.getId());
        } catch (OrderException ex) {
            throw new OrderException("could not save order");
        }
            return "DrawingPage";
       
    }     
}
