package ConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    //code to connect with database
    public Connection connection;
    public  Connection getConnection(){

        String dbName="fishing shack";
        String userName="root";
        String password="";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
