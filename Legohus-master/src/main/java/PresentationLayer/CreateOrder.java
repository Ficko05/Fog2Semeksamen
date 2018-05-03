
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class createOrder extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Order order = (Order) session.getAttribute("singleOrder");
        int userId = user.getId();
        int length = order.getLength();
        int width = order.getWidth();
        int height = order.getHeight();
        LogicFacade.createOrder(user, order);
        return user.getRole() + "page";
    }
    
}
