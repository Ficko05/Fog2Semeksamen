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
import FunctionLayer.Customer;
import FunctionLayer.Employee;
import java.sql.Date;
import java.sql.Timestamp;

public class Datamapper {

    /**
     * creates new order in database
     */
    public static void createOrder(Order order, int customer_id) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `order` (customer_id, height, length, width, roof_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            int height = order.getHeight();
            int length = order.getLength();
            int width = order.getWidth();
            ps.setInt(1, customer_id);
            ps.setInt(2, height);
            ps.setInt(3, length);
            ps.setInt(4, width);
            ps.setInt(5, 1);

            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());
        }
    }

    /**
     * Retrieves all orders from database and puts in an List
     */
    public static List<Order> allOrders() throws OrderException {
        List<Order> orderList = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM `order`";
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
                String date = rs.getString("date");
                String type = rs.getString("type");
                Order order = new Order(id, customer_id, length, width, height, roof_id, roof_angle, shed_id, customer_comment, status, date, type);
                orderList.add(order);
            }
            return orderList;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }

    }

    /**
     * Retrieves all Orders from database with the same customer_id as the
     * customer logged in
     */
    public static List<Order> CustomerOrders(Customer customer) throws OrderException {
        List<Order> orderList = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM `order` WHERE customer_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, customer.getId());
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
                String date = rs.getString("date");
                String type = rs.getString("type");
                Order order = new Order(id, customer_id, length, width, height, roof_id, roof_angle, shed_id, customer_comment, status, date, type);
                orderList.add(order);
            }
            return orderList;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }

    }

    /**
     * Changes status on order from waiting to accepted
     */
    public static void AcceptOrder(int orderid) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "Update `order` SET status=? WHERE id =?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "accepted");
            ps.setInt(2, orderid);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());
        }
    }

    /**
     * Creates a Customer in the database
     */
    public static void createCustomer(Customer customer) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO customer (username, password, email, phone) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, customer.getUsername());
            ps.setString(2, customer.getPassword());
            ps.setString(3, customer.getEmail());
            ps.setInt(4, customer.getPhone());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            customer.setId(id);
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * Checks for the email and password in the customer table in database sets
     * new customer with the details else throws an loginSampleException
     */
    public static Customer login(String email, String password) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM customer "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String username = rs.getString("username");
                int id = rs.getInt("id");
                int phone = rs.getInt("phone");
                Customer customer = new Customer(username, password, email, phone);
                customer.setId(id);
                customer.setUsername(username);
                customer.setPhone(phone);
                return customer;
            } else {
                throw new LoginSampleException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * Checks that the email and password are in the employee database sets new
     * emlpoyee with the details else throws an loginSampleException
     */
    public static Employee loginEmployee(String email, String password) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM employee "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String username = rs.getString("username");
                int id = rs.getInt("id");
                int phone = rs.getInt("phone");
                int cpr = rs.getInt("cpr");
                Employee user = new Employee(username, password, email, phone, cpr);
                user.setId(id);
                user.setUsername(username);
                user.setPhone(phone);
                return user;
            } else {
                throw new LoginSampleException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * Creates an employee in the database
     */
    public static void createEmployee(Employee employee) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO employee (username, password, email, phone, cpr) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, employee.getUsername());
            ps.setString(2, employee.getPassword());
            ps.setString(3, employee.getEmail());
            ps.setInt(4, employee.getPhone());
            ps.setInt(5, employee.getCpr());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            employee.setId(id);
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * Retrieves all customer information from database and adds them into the
     * List customerList
     */
    public static List<Customer> CustomerInfo() throws OrderException {
        List<Customer> customerList = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM customer";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                int phone = rs.getInt("phone");
                int id = rs.getInt("id");
                Customer customer = new Customer(id, username, password, email, phone);
                customerList.add(customer);
            }
            return customerList;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }

    }
}
