package PresentationLayer;

import FunctionLayer.Calculate;
import FunctionLayer.LoginSampleException;
import FunctionLayer.OrderException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("calculate_bricks", new Calculator() );
        commands.put("showOrderCommand", new showOrderCommand());
        commands.put( "CreateOrder", new CreateOrder() );
        commands.put( "newOrder", new  NewOrder() );
        commands.put( "customerpage", new customerpage());
        

    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginSampleException, OrderException;

}
