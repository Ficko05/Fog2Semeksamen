
package PresentationLayer;

import FunctionLayer.Employee;
import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CreateEmployeeCommand extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException {
     String username = request.getParameter( "username" );
        String email = request.getParameter( "email" );
        int phone = Integer.parseInt(request.getParameter("phone"));
        int cpr = Integer.parseInt(request.getParameter("cpr"));
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        if ( password1.equals( password2 ) ) {
            Employee employee = LogicFacade.createEmployee(username, password1, email, phone, cpr);
            HttpSession session = request.getSession();
            session.setAttribute( "employee", employee );
            return "EmployeePage";
        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }
    
    
    
}
