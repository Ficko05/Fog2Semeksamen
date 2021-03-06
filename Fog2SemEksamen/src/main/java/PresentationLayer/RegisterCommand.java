package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.Customer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        String username = request.getParameter( "username" );
        String email = request.getParameter( "email" );
        int phone = Integer.parseInt(request.getParameter("phone"));
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        if ( password1.equals( password2 ) ) {
            Customer customer = LogicFacade.createCustomer( username, password1, email, phone);
            HttpSession session = request.getSession();
            session.setAttribute( "customer", customer );
            return "CustomerPage";
        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }

}
