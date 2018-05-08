package FunctionLayer;

import DBAccess.Datamapper;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.util.ArrayList;
import java.util.List;


public class LogicFacade {

    public static Customer login( String email, String password ) throws LoginSampleException {
        return Datamapper.login( email, password );
    } 

    public static Customer createUser( String email, String password, String username, int phone) throws LoginSampleException {
        Customer user = new Customer(email, password, username, phone);
        Datamapper.createUser( user );
        return user;
    }
    
      public static List<Order> allOrders() throws OrderException {
        return Datamapper.allOrders();
    
      }
      
//    public static int customerById( User customer ) throws OrderException, ClassNotFoundException 
//    {
//        return Datamapper.customerById( customer );
//    }
      
    public static void createOrder(Order order) throws OrderException{
         Datamapper.createOrder(order);
    }
    
    
  

}
