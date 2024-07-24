/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author abhi0
 */
import java .sql.Connection;
import java .sql.DriverManager;


public class ConnectionProvider {
    

private static Connection con = null;


    
    public static Connection getCon(){
//        if (con != null)
//            return con;
      
  try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con= DriverManager.getConnection ( "jdbc:mysql://localhost:3306/libMangeSystem", "root", "Soumya123@");
      if ( con!= null){
          System.out.println( " Connected to the database");
      }         
      return con;
  
  } 
  catch(Exception e){
      System.out.println(e);
//      e.printStackTrace();
return null;
  }
  //return con;
}
//     private static void closeConnection() {
//       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    
//    try {
//            if (con != null) {
//                con.close();
//                System.out.println("Database connection closed");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//}
    public static void main ( String[] args){
        Connection con= ConnectionProvider .getCon();
        //ConnectionProvider.closeConnection();
    }

    
}

