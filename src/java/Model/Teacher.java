/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuttanan
 */
public class Teacher {
    private String TUsername;
    private String TName;
    private String TLastname;
    private String TPassword;

    public Teacher(String TUsername, String TName, String TLastname, String TPassword) {
        this.TUsername = TUsername;
        this.TName = TName;
        this.TLastname = TLastname;
        this.TPassword = TPassword;
    }

    public Teacher() {
    }

    public String getTUsername() {
        return TUsername;
    }

    public void setTUsername(String TUsername) {
        this.TUsername = TUsername;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public String getTLastname() {
        return TLastname;
    }

    public void setTLastname(String TLastname) {
        this.TLastname = TLastname;
    }

    public String getTPassword() {
        return TPassword;
    }

    public void setTPassword(String TPassword) {
        this.TPassword = TPassword;
    }

    @Override
    public String toString() {
        return "Teacher{" + "TUsername=" + TUsername + ", TName=" + TName + ", TLastname=" + TLastname + ", TPassword=" + TPassword + '}';
    }
    
        
    public static Teacher logIn(String TUsername,String TPassword){
        String sqlCmd = "Select * from Teacher where TUsername =? and TPassword=?";
        Connection con = ConnectionAgent.getConnection();
        Teacher t = null;
        try {
            PreparedStatement ps = con.prepareStatement(sqlCmd);
            ps.setString(1, TUsername);
            ps.setString(2, TPassword);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                t = new Teacher();
                t.setTUsername(rs.getString(1));
                t.setTName(rs.getString(2));
                t.setTLastname(rs.getString(3));
                t.setTPassword(rs.getString(4));                
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(t);
        return t;
    }
    
    
}
