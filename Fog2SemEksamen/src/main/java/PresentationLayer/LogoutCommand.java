package PresentationLayer;



import FunctionLayer.Customer;
import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException {
         request.getSession().invalidate(); 
            return "index";
    }

}