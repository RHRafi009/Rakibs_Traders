package Database;

import UI.PopUp.NoConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import rakibs.traders.RakibsTraders;

public class DBConnectionProvider {
    private static Connection conn;
    
    public static Connection getDBConnection(){
        if(conn==null){
            //No connecti    private static Connection conn;on exist so, required to create the conection
            try {
                //STEP 1: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //STEP 3: Open a connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost/rakibstraders", "root", "");
				System.out.println(conn);
            }catch(Exception ex){
                System.out.println("Failed to get DBConn:: "+ex.getMessage());
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);
            }

            
            return conn;
        }
        else
            return conn;
    }
}
