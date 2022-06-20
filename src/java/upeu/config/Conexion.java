package upeu.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class Conexion {
    private static final String URL="jdbc:mysql://b4r775vdc3fa7madafts-mysql.services.clever-cloud.com:3306/b4r775vdc3fa7madafts";
    private static final String USER = "ur4fmc656klw14yx";
    private static final String PASS = "TCpLfq0YZYqmUwv95uLN";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection cx = null;
    public static Connection getConexion(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    return cx;
    }

}
