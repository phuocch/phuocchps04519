/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.*;
import java.util.*;
import org.hibernate.*;
import Util.HibernateUtil;



/**
 *
 * @author phuoc
 */
public class CustomerDAO  {
      
      public static List<Customer> layDanhSachKhachHang(String username){
            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
              List<Customer> list=null;
                  try{
                  session.beginTransaction();
                  String sql="from Customer where username like '%"+username+"%'";
                  Query query=session.createQuery(sql);
                  list=query.list();
                  return list;
                  }catch(Exception e){
                   e.printStackTrace();
                   return null;
                  }

          }
      public static Customer LayThongTinKH(String username){
              Session session=HibernateUtil.getSessionFactory().openSession();
              try{
                  session.beginTransaction();
                  Customer cs=(Customer) session.get(Customer.class, username);
                  return cs;

              }catch(Exception e){

                return null;
              }
              finally{
                session.close();
                 }
          }
      public static boolean XoaKhachHang(String username){
            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
              try{
                  Customer cus=CustomerDAO.LayThongTinKH(username);
                  if(cus==null)
                  return false;
                  session.beginTransaction();
                  session.delete(cus);
                  session.getTransaction().commit();
                  return true;

              }catch(Exception e){
                  session.getTransaction().rollback();
                  System.out.println(e);
                  return false;
              }

      }
      public static  boolean ThemKhachHang(Customer Cus){
            if(CustomerDAO.LayThongTinKH(Cus.getUsername())!=null)
                return false;
            Session session=HibernateUtil.getSessionFactory().openSession();
              try{
                  session.beginTransaction();
                  session.save(Cus);
                  session.getTransaction().commit();
                  return true;
              }catch(Exception e){
                  session.getTransaction().rollback();
                  System.out.println(e);
                  return false;

              }
              finally{
                  session.close();
              }
      }
     public static boolean SuaThongTinKhachHang(Customer cus){
          if(CustomerDAO.LayThongTinKH(cus.getUsername())==null)
             return false;
           Session session=HibernateUtil.getSessionFactory().getCurrentSession();
         try{
           
            session.beginTransaction();
            session.update(cus);
            session.getTransaction().commit();
            return true;
         
         }catch(Exception e){
             session.getTransaction().rollback();
             System.err.println(e);
             return false;
         
         }
     
     }
      public static void main(String[] args) {
          System.err.println(""+CustomerDAO.XoaKhachHang("2121"));
    }
}
