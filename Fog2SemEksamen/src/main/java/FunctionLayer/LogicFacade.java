package FunctionLayer;

import DBAccess.Datamapper;
import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.util.ArrayList;
import java.util.List;


public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return Datamapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, email, 0, 0, email);
        Datamapper.createUser( user );
        return user;
    }
    
      public static List<Order> getOrders(User user) throws OrderException {
        return Datamapper.getOrders(user);
    
      }
      
    public static void createOrder(Order order, int user_id) throws OrderException{
         Datamapper.createOrder(order, user_id);
    }
    
    
  

}
