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

    public static Customer createCustomer( String username, String password, String email, int phone) throws LoginSampleException {
        Customer user = new Customer(username, password, email, phone);
        Datamapper.createCustomer( user );
        return user;
    }
    public static Employee loginEmployee( String email, String password ) throws LoginSampleException {
        return Datamapper.loginEmployee( email, password );
    } 
    
    public static Employee createEmployee(String username, String password, String email, int phone, int cpr) throws LoginSampleException {
        Employee emp = new Employee(username, password, email, phone, cpr);
        Datamapper.createEmployee( emp );
        return emp;
    }
    
      public static List<Order> allOrders() throws OrderException {
        return Datamapper.allOrders();
    
      }
      
      public static List<Order> CustomerOrders(Customer customer) throws OrderException {
        return Datamapper.CustomerOrders(customer);
      }
      
//    public static int customerById( User customer ) throws OrderException, ClassNotFoundException 
//    {
//        return Datamapper.customerById( customer );
//    }
      
    public static void createOrder(Order order, int customer_id) throws OrderException{
         Datamapper.createOrder(order, customer_id);
    }
    
    
  

}
