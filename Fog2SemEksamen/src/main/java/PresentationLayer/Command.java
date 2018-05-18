package PresentationLayer;


import FunctionLayer.exceptions.LoginSampleException;
import FunctionLayer.exceptions.OrderException;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    /* */
    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new LoginCommand() );  
        commands.put( "logout", new LogoutCommand() );
        commands.put( "inputPage" , new CustomerCommand() );
        commands.put( "CreateOrderPage" , new CreateOrderCommand());
        commands.put( "RegisterPage" , new RegisterCommand());
        commands.put( "LoginEmployeePage", new LoginEmployeeCommand() );
        commands.put( "EmployeePage", new EmployeePageCommand() );
        commands.put( "ShowOrders", new ShowOrdersCommand() );
        commands.put( "ShowCustomerOrders", new ShowCustomerOrdersCommand());
        commands.put( "CreateEmployeePage", new CreateEmployeePageCommand());
        commands.put( "CreateEmployee", new CreateEmployeeCommand());
        commands.put( "CustomerPageButton", new CustomerPageCommand());
        commands.put( "Bom", new BomCommand() ); 
        commands.put( "Accepter", new AccepterOrdreCommand());
        commands.put( "CustomerInfo", new CustomerInfoCommand());
        
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws ServletException, IOException, LoginSampleException, OrderException, ClassNotFoundException;

}
