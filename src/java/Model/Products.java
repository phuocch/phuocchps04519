/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author phuoc
 */
public class Products {

    public Products() {
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
     public ArrayList<Product> list(String name){
         ArrayList<Product> list=new ArrayList<>();
         connectCSDL();
         Statement stmt = null;
         String sql="select * from Product where name like '%"+name+"%'";
        try {
            stmt =con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
            String Id=rs.getString("code");
            String Name=rs.getString("name");
            String Price=rs.getString("price");
            String image=rs.getString("image");
          
            Product product=new Product(Id,Name,Price,image);
            list.add(product);
            }
          
            rs.close();
            stmt.close();
            con.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi: " + e + e.getMessage());

        }
    
        return null;
    }
    public void InsertProduct(String code,String name,String price,String image){
        connectCSDL();
        String sql="insert into Product(code,name,price,image) values(?,?,?,?)";
        PreparedStatement ps=null;
        
        try {
            ps=con.prepareStatement(sql);
             ps.setString(1,code);
               ps.setString(2,name);
                  ps.setString(3,price);
                     ps.setString(4,image);
            ps.executeUpdate();
            ps.close();
            con.close();
          
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     }
    public void Delete(String masp){
         connectCSDL();
         String sql="delete from Product where code=?";
          PreparedStatement ps=null;
        
        try {
            ps=con.prepareStatement(sql);
             ps.setString(1,masp);
             ps.executeUpdate();
             ps.close();
             con.close();
         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void Update(String code,String name,String price,String image){
        connectCSDL();
        String sql="UPDATE Product SET name=?,price=?,image=? WHERE code=?";
        PreparedStatement ps=null;
        
        try {
            ps=con.prepareStatement(sql);
             ps.setString(1,name);
             ps.setString(2,price);
             ps.setString(3,image);
             ps.setString(4,code); 
             ps.executeUpdate();
             ps.close();
             con.close();
         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
       
      public static void main(String[] args) {
     Products c=new Products();
        c.connectCSDL();
    }

}
