
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.User;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CreateOrder extends Command {
   
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderException, ClassNotFoundException {
        int height = Integer.parseInt(request.getParameter("height"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int roof_id = Integer.parseInt(request.getParameter("roof_id"));
        int roof_angle = Integer.parseInt(request.getParameter("roof_angle"));
        int shed_id = Integer.parseInt(request.getParameter("shed_id"));
        String customer_comment = request.getParameter("roof_id");        
        String type = request.getParameter("type");
        HttpSession session = request.getSession();
//        User customer = (User) session.getAttribute("customer");
//        int customerId = LogicFacade.customerById( customer );
        
        User user = (User) session.getAttribute("user");
        
        try {
            LogicFacade.createOrder(user, new Order(length, width, height, roof_id, roof_angle, shed_id, customer_comment, type));
        } catch (OrderException ex) {
            throw new OrderException("could not save order");
        }
        return "customerpage";
    }     
}
