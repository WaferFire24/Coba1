package Connection;

import java.sql.Connection;

public class MainConn {
    public static void main(String[] args) {
        ConnManager conMan = new ConnManager();
        
        try {
            conMan.Logon();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}