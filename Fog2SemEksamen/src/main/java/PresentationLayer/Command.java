package PresentationLayer;

//import database.FunctionLayer.LoginSampleException;
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
        //commands.put( "login", new LoginCommand() );
        
       
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract void execute( HttpServletRequest request, HttpServletResponse response ) 
            throws ServletException, IOException;

}
