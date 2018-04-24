package PresentationLayer;

//import database.FunctionLayer.LoginSampleException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*exeption to the servlet */ 
public class UnknownCommand extends Command {

    void execute( HttpServletRequest request, HttpServletResponse response ) throws ServletException {
        String msg = "Unknown command. Contact IT";
        request.setAttribute("error", msg);
        request.getRequestDispatcher("/WEB-INF/login.jsp");
    }

}
