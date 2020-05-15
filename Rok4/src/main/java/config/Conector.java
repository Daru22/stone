
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bdcomercio?serverTimezone=UTC";
    String user="root";
    String pass="12345";

    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
            catch(ClassNotFoundException e){
                    System.out.println("No se encontro el Driver");
                    }
        try{
            con=DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }   
}
