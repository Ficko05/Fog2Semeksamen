
package PresentationLayer;

import FunctionLayer.Employee;
import FunctionLayer.LogicFacade;
import FunctionLayer.exceptions.LoginSampleException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginEmployeeCommand extends Command{
   
   
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException {
        String email = request.getParameter( "email" );
        String password = request.getParameter( "password" );
        Employee employee = LogicFacade.loginEmployee( email, password );
        HttpSession session = request.getSession();
        session.setAttribute( "employee", employee );
            return "EmployeePage";
}
}
