package DBAccess;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Connector {

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }
/*this mothod connects to the server/droplet */
    public static Connection connection() throws SQLException {
        if (singleton == null) {
            MysqlDataSource source = new MysqlDataSource();
            source.setServerName("159.89.10.139");
            source.setPort(3306);
            source.setDatabaseName("Fog");
            source.setUser("susteven");
            source.setPassword("asdfghjklæø");
            singleton = source.getConnection();
        }
        return singleton;
    } 
    
}
