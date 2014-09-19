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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuttanan
 */
public class ShowAllStudent {
 private int StId;
    private String StName;
    private String StLastname;
    private int Year;
    private String UrlPic;
    private String Password;
static Connection con = ConnectionAgent.getConnection();

    public ShowAllStudent(int StId, String StName, String StLastname,int Year, String UrlPic, String Password) {
        this.StId = StId;
        this.StName = StName;
        this.StLastname = StLastname;
        this.Year = Year;
        this.UrlPic = UrlPic;
        this.Password = Password;
    }

    public ShowAllStudent() {
    }

    public int getStId() {
        return StId;
    }

    public void setStId(int StId) {
        this.StId = StId;
    }

    public String getStName() {
        return StName;
    }

    public void setStName(String StName) {
        this.StName = StName;
    }

    public String getStLastname() {
        return StLastname;
    }

    public void setStLastname(String StLastname) {
        this.StLastname = StLastname;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public String getUrlPic() {
        return UrlPic;
    }

    public void setUrlPic(String UrlPic) {
        this.UrlPic = UrlPic;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        ShowAllStudent.con = con;
    }

    @Override
    public String toString() {
        return "ShowAllStudent{" + "StId=" + StId + ", StName=" + StName + ", StLastname=" + StLastname + ", UrlPic=" + UrlPic + ", Password=" + Password + '}';
    }
    
    public static List<ShowAllStudent> showStudent() {
        String sql = "select * from Student";
        Connection con = ConnectionAgent.getConnection();
        ShowAllStudent s = null;
        List<ShowAllStudent> ShowAllStudent = new ArrayList<ShowAllStudent>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s = new ShowAllStudent();
                rToO(s, rs);
                ShowAllStudent.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ShowAllStudent;
    }
    
    public static ShowAllStudent ShowSt(String StId) {
        
        String sql = "select * from Student where StId=?";
        Connection con = ConnectionAgent.getConnection();
        ShowAllStudent s = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(StId) );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s = new ShowAllStudent();
                rToO(s, rs);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
     public static List<ShowAllStudent> ShowStudent(String StName) {
        
        String sql = "select * from Student where StName like ?";
        Connection con = ConnectionAgent.getConnection();
        ShowAllStudent s = null;
         List<ShowAllStudent> showStudent = new ArrayList<ShowAllStudent>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, StName+"%" );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s = new ShowAllStudent();
                
                rToO(s, rs);
                showStudent.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return showStudent;
    }
     
     public static int editProfile(ShowAllStudent st) {
        String sqlCmd = "update Student set  StId=? , StName=? , StLastname=? , Year=? where StId =? ";
        Connection con = ConnectionAgent.getConnection();

        int rv = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sqlCmd);
            ps.setInt(1, st.getStId());
            ps.setString(2, st.getStName());
            ps.setString(3, st.getStLastname());
           // ps.setString(4, st.getPassword());
            ps.setInt(4, st.getYear());
            ps.setInt(5, st.getStId());
            rv = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShowAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rv;
    }
    public static int insertStudent(ShowAllStudent st) {
        String sqlCmd = "INSERT INTO Student(`StId`, `StName`, `StLastname`, `Year`, `UrlPic`, `Password`) VALUES(?,?,?,?,?,?)";
        Connection con = ConnectionAgent.getConnection();

        int rv = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sqlCmd);
            ps.setInt(1, st.getStId());
            ps.setString(2, st.getStName());
            ps.setString(3, st.getStLastname());
            
            ps.setInt(4, st.getYear());
            ps.setString(5, "/");
            ps.setString(6,st.getPassword() );
            rv = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShowAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rv;
    }
     
    private static void rToO(ShowAllStudent s, ResultSet rs) {
        try {
            
            s.setStId(rs.getInt("StId"));
            s.setStName(rs.getString("StName"));
            s.setStLastname(rs.getString("StLastname"));
            s.setYear(rs.getInt("Year"));
            s.setUrlPic(rs.getString("UrlPic"));
            s.setPassword(rs.getString("Password"));
        } catch (SQLException ex) {
            Logger.getLogger(ShowAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static ShowAllStudent logIn(int StUsername,String StPassword){
        String sqlCmd = "Select * from Student where StId =? and Password=?";
        Connection con = ConnectionAgent.getConnection();
        ShowAllStudent s = null;
        try {
            PreparedStatement ps = con.prepareStatement(sqlCmd);
            ps.setInt(1, StUsername);
            ps.setString(2, StPassword);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                s = new ShowAllStudent();
                s.setStId(rs.getInt(1));
                s.setStName(rs.getString(2));
                s.setStLastname(rs.getString(3));
                s.setYear(rs.getInt(4));
                s.setUrlPic(rs.getString(5));
                s.setPassword(rs.getString(6));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(s);
        return s;
    }
}
    

