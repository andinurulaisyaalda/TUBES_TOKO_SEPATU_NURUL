/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tokosepatu.nurul.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseMySQL {
    private static Connection connection = null;
    
    public static Connection getConnection() throws Exception{
        if (connection==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/sepatu","root","");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return connection;
    }
    
    public static boolean isConnect(){
        try {
            if (getConnection()==null){
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
