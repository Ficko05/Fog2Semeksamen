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
        commands.put( "CustomerPage" , new CustomerCommand() );
        commands.put( "CreateOrderPage" , new CreateOrderCommand());
        commands.put( "RegisterPage" , new RegisterCommand());
        commands.put( "EmployeePage", new EmployeeCommand() );
        commands.put( "InputPage", new DrawerCommand()  );
        commands.put( "ShowOrders", new ShowOrdersCommand() ); 
        commands.put( "Bom", new BomCommand() ); 
        
       
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
