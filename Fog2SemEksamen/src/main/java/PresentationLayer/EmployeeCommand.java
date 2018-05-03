package PresentationLayer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeCommand extends Command{
    
     @Override
     String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            return "EmployeePage";
//        try {
         //  request.getRequestDispatcher("/WEB-INF/CustomerPage.jsp").forward(request, response);
//        } catch (Exception e) {
//            System.out.println("here was your fuck up");
//        }
    }
}
