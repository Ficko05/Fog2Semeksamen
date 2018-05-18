/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Customer;
import FunctionLayer.Drawer;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolai
 */
public class AccepterOrdreCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException {
     HttpSession session = request.getSession();
        int orderid = Integer.parseInt(request.getParameter("orderid"));
        try {
            LogicFacade.AcceptOrder(orderid);
            List<Order> orders = LogicFacade.allOrders();
           session.setAttribute("orders", orders);
        } catch (OrderException ex) {
            throw new OrderException("could not save order");
        }

        return "OrdreOversigt";
    }


    
}
