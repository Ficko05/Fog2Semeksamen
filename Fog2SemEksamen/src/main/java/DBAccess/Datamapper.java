
package DBAccess;

import FunctionLayer.Order;
import FunctionLayer.exceptions.OrderException;
import FunctionLayer.exceptions.LoginSampleException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import FunctionLayer.User;


public class Datamapper {
   
    /**puts values into OrderDB*/
    public static void createOrder (Order order, User user) throws OrderException{
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Order (customer_id, height, length, width, tag_id, shed_id, customer comment, status, type) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, user.getId());
            ps.setInt( 2, order.getLength());
            ps.setInt( 3, order.getWidth());
            ps.executeUpdate();
            } catch ( SQLException | ClassNotFoundException ex ) {
            throw new OrderException(ex.getMessage() );
            }
    }
//    
    public static List<Order> getOrders(User user) throws OrderException{
           List<Order> orderList = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orderlist where user_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, user.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                String status = rs.getString("status");
                int user_id = rs.getInt("user_id");
                Order order = new Order(length, width, height);
                orderList.add(order);
            }
            return orderList;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        
        
    }
//    
    public static void createUser( User user ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO customer (username, password, email, phone) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getUsername());
            ps.setString( 2, user.getPassword() );
            ps.setString( 3, user.getEmail());
            ps.setInt(4, user.getPhone());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    
    public static User login( String email, String password ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT id, role FROM users "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, email );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String role = rs.getString( "role" );
                int id = rs.getInt( "id" );
                User user = new User( role, password, email, id, id);
                user.setId(id );
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
//    
//    public static void createEmployee( Employee employee ) throws LoginSampleException {
//        try {
//            Connection con = Connector.connection();
//            String SQL = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";
//            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
//            ps.setString( 1, employee.getEmail() );
//            ps.setString( 2, employee.getPassword() );
//            ps.setString( 3, employee.getRole() );
//            ps.executeUpdate();
//            ResultSet ids = ps.getGeneratedKeys();
//            ids.next();
//            int id = ids.getInt( 1 );
//            employee.setId( id );
//        } catch ( SQLException | ClassNotFoundException ex ) {
//            throw new LoginSampleException( ex.getMessage() );
//        }
//    }
//    
    
    
}
