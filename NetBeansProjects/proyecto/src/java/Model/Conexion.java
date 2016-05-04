/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

/**
 *
 * @author John
 */
public class Conexion {
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";  
   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
   //  Database credentials
   static final String USER = "elcomilon";
   static final String PASS = "comilon";
   Connection conn = null;
   public Connection Conectar(){
        Connection conn = null;
        Statement stmt = null;
        try{
           //STEP 2: Register JDBC driver
           Class.forName("oracle.jdbc.OracleDriver");

           //STEP 3: Open a connection
           System.out.println("Connecting to database...");
           conn = DriverManager.getConnection(DB_URL,USER,PASS);

        }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
           conn=null;
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
           conn=null;
        }finally{
           return conn;
        }//end try
    }//end main
}
