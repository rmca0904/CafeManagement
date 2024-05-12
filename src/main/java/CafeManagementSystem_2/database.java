
package CafeManagementSystem_2;

import java.sql.Connection;
import java.sql.DriverManager;


public class database {

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/cafesystem", "regan.a.mcaleavy@gmail.com", "CompSci!2024");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}