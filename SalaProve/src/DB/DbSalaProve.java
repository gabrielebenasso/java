package DB;

import java.sql.*;
import java.util.*;


public class DbSalaProve {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "http://127.0.0.1:81/phpmyadmin/index.php?route=/database/structure&server=1&db=salaprove";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "zildjian";

    public static void main(String[] args) {

        Connection conn = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            Statement stmt = conn.createStatement();
            String sqlUsers;
            String sqlOwners;
            sqlUsers = "UPDATE TABLE users" +
                    "SET user_id," +
                    "nome_gruppo," +
                    "n_componenti," +
                    "genere," +
                    "password;";
            sqlOwners = "ALTER TABLE owners" +
                    "ALTER COLUMN owner_id," +
                    "owner_name," +
                    "studio_name," +
                    "owner_email," +
                    "password;";





            //STEP 5: Extract data from result set
//            while(rs.next()){
//                //Retrieve by column name
//                int id  = rs.getInt("id");
//                String name = rs.getString("name");
//                String first = rs.getString("studio_name");
//                String last = rs.getString("owner_email");
//
//                //Display values
//                System.out.print("ID: " + id);
//                System.out.print(", Age: " + name);
//                System.out.print(", First: " + first);
//                System.out.println(", Last: " + last);
//            }
//            //STEP 6: Clean-up environment
//            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample




