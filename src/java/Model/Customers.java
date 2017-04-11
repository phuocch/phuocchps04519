/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuoc
 */
public class Customers {

    public Customers() {
    }
    Connection con=null;
//    public void connectCSDL(){
//    
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//           
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SOF301","sa","");
//           
//        } catch (SQLException ex) {
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//     }
    public void connectCSDL(){
    
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con= DriverManager.getConnection("jdbc:sqlserver://ps04519server.database.windows.net:1433;database=ps04519_database","phuocch@ps04519server","Phuoc22138990");
           
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public boolean checkLogin(String id,String pass){
        try {
            connectCSDL();
            String sql="select * from Customer where Username=? and Password=?";
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setString(1,id);
            stm.setString(2,pass);
            ResultSet rs=stm.executeQuery();
            boolean exit=false;
            exit=rs.next();
            if(exit){
            return true;
            }
            stm.close();
            con.close();
        } catch (Exception e) {
           e.printStackTrace();

        }
    
    return false;  
    }
    
    public boolean role(String user){
         try {
            connectCSDL();
            String sql="select * from Customer where Username=?";
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setString(1,user);
            ResultSet rs=stm.executeQuery();
            boolean exit=false;
            while(rs.next()){
            String role=rs.getString("Role");
            if(rs.getString("Role").equals("true")){
            return true;
            }
         }
            stm.close();
            con.close();
        } catch (Exception e) {
           e.printStackTrace();

        }
         return false;
    }
    public String anh(String user){
        try{
            connectCSDL();
            String sql="select * from Customer where Username=?";
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setString(1,user);
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
            String anh=rs.getString("Anh");
            return anh;
            }
        
        }catch(Exception e){
        
        
        }
        return null;
    
    }
    public static void main(String[] args) {
        Customers c=new Customers();
        c.connectCSDL();
    }

}
