/*
package screensframework;

import java.sql.Connection;
import java.sql.DriverManager;

public class Login1conDB {

    public Connection connection;
    public Connection getconnection(){

        String dbName="fishing shack";
        String userName="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName ,userName ,password);


        }catch (Exception ex){
            ex.printStackTrace();
        }
        return connection;
    }
}*/
