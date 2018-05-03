package PresentationLayer;

import FunctionLayer.Bricks;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.Calculate;
import FunctionLayer.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Calculator extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        int l = Integer.parseInt(request.getParameter("length"));
        int w = Integer.parseInt(request.getParameter("width"));
        int h = Integer.parseInt(request.getParameter("height"));
//        request.setAttribute("width", w);
//        request.setAttribute("length", l);
//        request.setAttribute("height", h);
        Bricks bricks = Calculate.orderCalculator(new Order(w, l, h));
        request.setAttribute("bricks", bricks);
        return "customerOrder";
    }

}
