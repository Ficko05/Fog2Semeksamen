//
//package DBAccess;
//
//import FunctionLayer.Customer;
//import FunctionLayer.Order;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.List;
//import junit.framework.AssertionFailedError;
//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.Test;
//
//
//public class DatamapperTest {
//
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @Test
//    public void testCreateOrder() throws Exception {
//        System.out.println("createOrder");
//        Order order = null;
//        Datamapper.createOrder(order);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAllOrders() throws Exception {
//        System.out.println("allOrders");
//        List<Order> expResult = null;
//        List<Order> result = Datamapper.allOrders();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCreateUser() throws Exception {
//        System.out.println("createUser");
//        Customer user = null;
//        Datamapper.createUser(user);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testLogin() throws Exception {
//        System.out.println("login");
//        String email = "";
//        String password = "";
//        Customer expResult = null;
//        Customer result = Datamapper.login(email, password);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    
//    
//}
//    
//   