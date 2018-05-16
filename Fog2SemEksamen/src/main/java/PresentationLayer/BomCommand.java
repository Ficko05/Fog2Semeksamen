
package PresentationLayer;

import FunctionLayer.BillOfMaterial;
import FunctionLayer.Calculator;
import FunctionLayer.Order;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BomCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException {
       
        HttpSession session = request.getSession();
        Order order = (Order) session.getAttribute("order");
        Calculator calc = new Calculator();
        BillOfMaterial billom = new BillOfMaterial();
        ArrayList bom = billom.makeBom(calc.calculate(order));
        session.setAttribute("bom", bom);
        return "BomPage";
    }

}
