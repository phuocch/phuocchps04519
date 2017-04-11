/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Util.HibernateUtil;
import entity.Cart;
import entity.Customer;
import entity.Product;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author phuoc
 */
public class CartDao extends HashMap {

    private Session session;
    public static String numbercart = "";

    public CartDao() {
        super();
    }

    public String addProduct(Cart cart) {
        String key = cart.getProduct().getCode();
        String cunumber = "";
        if (this.containsKey(key)) {
            numbercart = ((Cart) this.get(key)).getNumberCart();
            int oldnumber = Integer.parseInt(((Cart) this.get(key)).getNumber());
            cunumber = String.valueOf(oldnumber);
            String newnumber = String.valueOf(oldnumber + 1);
            ((Cart) this.get(key)).setNumber(newnumber);
            return newnumber;
        } else {
            this.put(cart.getProduct().getCode(), cart);
            return cunumber;

        }

    }

    public boolean removeCart(String code) {
        if (this.containsKey(code)) {
            this.remove(code);
            return true;
        }

        return false;

    }

    public static List<Cart> layDanhSachCart(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Cart> list = null;
        try {
            session.beginTransaction();
            String sql = "from Cart where username like '%" + username + "%'";
            Query query = session.createQuery(sql);
            list = query.list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }

    }
    public static List<Cart> layDanhSachCartName(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Cart> list = null;
        try {
            session.beginTransaction();
            String sql = "from Cart where name like '%" + username + "%'";
            Query query = session.createQuery(sql);
            list = query.list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }

    }
    
   

    public static void ThemThongTinCart(Cart cart) {
        List<Cart> nC=CartDao.layDanhSachCartName("");
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
                session.beginTransaction();
                 Cart cs = CartDao.LayThongTinCart(cart.getNumberCart());
            if (CartDao.LayThongTinCart(cart.getNumberCart()) != null )
                    {
                //lay number hien tai cua Cart
                cart.setNumber(cs.getNumber());
                int num = (Integer.parseInt(cart.getNumber())) + 1;
                String number = String.valueOf(num);
               
                //cap nhat lai number cua cart sau khi click thi tang len 1
                cart.setNumber(number);
               
                //iupdate
                session.update(cart);
                session.getTransaction().commit();
              
            } else {
                int numcart = nC.size() + 1;
                String numbercart = String.valueOf(numcart);
                cart.setNumberCart(numbercart);
                session.save(cart);
                session.getTransaction().commit();

            }
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.err.println(e);

        }

    }

    

    public static Cart LayThongTinCart(String NumberCart) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Cart cs = (Cart) session.get(Cart.class, NumberCart);
            return cs;

        } catch (Exception e) {

            return null;
        } finally {
            session.close();
        }
    }
   

    public static boolean XoaCart(String numbercart) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            Cart cus = CartDao.LayThongTinCart(numbercart);
            if (cus == null) {
                return false;
            }
            session.beginTransaction();
            session.delete(cus);
            session.getTransaction().commit();
            return true;

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        }

    }
      public static void main(String[] args) {
//       Cart n=CartDao.LayThongTinCart("SP001");
//        System.out.println("dao.CartDao.main()"+n.getNumber());
//         String n="";
//       Cart a=new Cart("2",n, n, n, n, n, n);
//       CartDao.ThemThongTinCart(a);
//        List<Cart> c=CartDao.layDanhSachCart("phuocch");
//        for(int i=0;i<c.size();i++){
//            System.out.println("dao.CartDao.main()"+c.get(i).getName());
//        }
String a="17";
        CartDao.XoaCart(a);

    }

   
}
