package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnManager{
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/crudoop";
    private String username = "root";
    private String password = "";


    //Bikin classpath jdbc baru, mnta tomo JARnya
    
    public Connection Logon() throws ClassNotFoundException {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Success");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public void LogOff(){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}