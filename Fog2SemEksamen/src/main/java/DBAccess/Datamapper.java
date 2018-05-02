
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
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;


public class Datamapper {
   
    /**puts values into OrderDB*/
    public static void createOrder (User user, Order order) throws OrderException{
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO order (height, length, width) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
//            ps.setInt( 1, user.getId());
            ps.setInt( 1, order.getHeight());
            ps.setInt( 2, order.getLength());
            ps.setInt( 3, order.getWidth());
//            ps.setInt( 5, order.getTag_id());
//            ps.setInt( 6, shed_id);
//            ps.setString( 7, user.getComment());
//            ps.setString( 6, status);
//            ps.setInt( 8, type);
            
            ps.executeUpdate();
            } catch ( SQLException | ClassNotFoundException ex ) {
            throw new OrderException(ex.getMessage() );
            }
    }



    public static List<Order> allOrders() throws OrderException{
           List<Order> orderList = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM order";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int customer_id = rs.getInt("customer_id");
                int height = rs.getInt("height");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int roof_id = rs.getInt("roof_id");
                int roof_angle = rs.getInt("roof_angle");
                int shed_id = rs.getInt("shed_id");
                String customer_comment = rs.getString("customer_comment");
                String status = rs.getString("status");
                Date date = rs.getDate("date");
                String type = rs.getString("type");
                Order order = new Order(customer_id, length, width, height, roof_id, roof_angle, shed_id, customer_comment, status, date, type);
                orderList.add(order);
            }
            return orderList;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        
        
    }
    
//    /** rigtige løsning på CreateOrder når man kan logge ind*/
//    public static int customerById( User user ) throws OrderException, ClassNotFoundException
//    {
//        String username = user.getUsername();
//        final String SQL = "Select * FROM customer WHERE username=?";
//        try(PreparedStatement statement = Connector.connection().prepareStatement(SQL)) 
//        {
//            statement.setString(1, username);
//            ResultSet rs = statement.executeQuery();
//            if(rs.next()) {
//                int idUser = rs.getInt("id");
//                return idUser;
//            }
//            throw new SQLException();
//        } catch (SQLException | ClassNotFoundException throwSql) {
//            throw new OrderException(throwSql.getMessage());
//        }
//    }



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
            String SQL = "SELECT id FROM users "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, email );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String username = rs.getString("username");
                String comment = rs.getString( "comment" );
                int id = rs.getInt( "id" );
                int phone = rs.getInt( "phone" );
                User user = new User(username, password, email, id, phone, comment);
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
