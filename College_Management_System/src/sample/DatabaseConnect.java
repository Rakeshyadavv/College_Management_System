package sample;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.sql.*;

public class DatabaseConnect {

    Connection conn = null;
    Statement stmt = null;
    boolean connectionstatus;



    DatabaseConnect()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:collegeManagementSystem.db");
            connectionstatus = true;

            System.out.println("Connection to SQLite has been established.");
        }
        catch (Exception e ){
            System.out.println(   "connection Failed");
        }
    }

    boolean testconnection()
    {
        return connectionstatus;
    }




        /**
         * Connect to a sample database
         */
        public boolean checkLogin(String username  , String passwords ) {

            try {




              // Ensure we can query the Login  table
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * from Login WHERE UserName = "  + "\"" + username + "\" " + " AND Password = "  +  "\"" +  passwords + "\"");

                while ( rs.next() ) {

                    return  true;

                }

                rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            return false;
        }

}
