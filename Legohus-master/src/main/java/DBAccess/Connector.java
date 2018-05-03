package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static final String url = "jdbc:mysql://165.227.169.82:3306/useradmin?autoReconnect=true";
    private static final String username = "sunicolai";
    private static final String password = "root";

    private static Connection singleton;
//
    public static void setConnection(Connection con) {
        singleton = con;
    }
    


    

    public static Connection connection() throws ClassNotFoundException, SQLException  {
        if ( singleton == null ) {
            Class.forName( "com.mysql.jdbc.Driver" );
            singleton = DriverManager.getConnection( url, username, password );
        }
        return singleton;
    }
}

//    public static Connection connection() throws ClassNotFoundException, SQLException {
//        if (singleton == null) {
//            MysqlDataSource source = new MysqlDataSource();
//            source.setServerName("165.227.169.82");
//            source.setPort(3306);
//            source.setDatabaseName("useradmin");
//            source.setUser("sunicolai");
//            source.setPassword("root");
//            singleton = source.getConnection();
//        }
//        return singleton;
//    }
//}

