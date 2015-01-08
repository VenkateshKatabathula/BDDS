/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DR100623
 */
public class DBUtility {
public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;

            Class.forName("oracle.jdbc.OracleDriver");
            con =DriverManager.getConnection("jdbc:oracle:thin:@hstslc015:1521:elp","elp1115","msat123$");
            
            return con;

        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
