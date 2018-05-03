package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Calculate;
import FunctionLayer.OrderException;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Command action = Command.from(request);
            String view = action.execute(request, response);
            request.getRequestDispatcher("/WEB-INF/" + view + ".jsp").forward(request, response);
            
        } catch (LoginSampleException ex) {
            request.setAttribute("error", ex.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        catch (OrderException oex) {
            request.setAttribute("error",oex.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

       
            
       
        

//        double type = dao.getTypePrice(request.getParameter("kidd"));
//
//        double glass = dao.getGlassPrice();
//        double sum = Calculate.Calculate(h, w, type);
//
//        out.println("<br> ");
//
//        out.println("sum is " + sum + "kr. ");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
