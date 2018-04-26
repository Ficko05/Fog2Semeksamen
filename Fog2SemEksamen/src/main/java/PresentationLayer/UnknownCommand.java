
package PresentationLayer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UnknownCommand extends Command {

     @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws ServletException {
        String msg = "Unknown command. Contact IT";
        throw new ServletException( msg );
    }
    
}
