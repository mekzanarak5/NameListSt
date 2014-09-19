/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuttanan
 */
public class ConnectionAgent {
// c = DriverManager.getConnection("jdbc:mysql://localhost:3306/checking_a", "checking_A", "app123456"); 
// c = DriverManager.getConnection("jdbc:mysql://localhost/Attention?userUnicode=yes&characterEncoding=UTF-8", "root", "");
    public static Connection getConnection() {
        Connection c = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        // c = DriverManager.getConnection("jdbc:mysql://localhost/Attention?userUnicode=yes&characterEncoding=UTF-8", "root", "");
	 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/checking_a", "checking_A", "app123456"); 
            System.out.println("Connected");   
        
        }catch(ClassNotFoundException ex){
            System.out.println("class");
            Logger.getLogger(ConnectionAgent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("sql");
            Logger.getLogger(ConnectionAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}