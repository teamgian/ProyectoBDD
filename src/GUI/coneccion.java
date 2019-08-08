/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author AlejandraAndrea
 */

import java.sql.*;
 class conecion {  public static void main (String args []) throws SQLException

  {    
    Connection conn = null;
    DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());

    conn = DriverManager.getConnection
          ("jdbc:oracle:thin:@localhost:1521:xe", "system", "ale1509J");
         //                                         userid,  password
    if (conn != null){
        System.out.println("Base de datos conectada");
    }
    else{
        System.out.println("Base de datos no conectada");
    }
    
    //consulta
    Statement stmt = conn.createStatement();
    ResultSet rset = 
              stmt.executeQuery("select Rut_A from Ayudante_e1");
    while (rset.next())
        System.out.println (rset.getString(1));   // Print col 1
    
    stmt.close();
                  
        System.out.println ("hola");   // Print col 1


  }
 } 