/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.CartDao;
import entity.Cart;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phuoc
 */
public class ControllerCart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String action=request.getParameter("action");
            if(action.equals("Add to Cart")){
                HttpSession session=request.getSession(true);
                CartDao shop=(CartDao)session.getAttribute("SHOP");
                if(shop==null){
                shop=new CartDao();
                }
                String code=request.getParameter("txtCode");
                String name=request.getParameter("txtName");
                String pr=request.getParameter("txtPrice");
                String image=request.getParameter("txtImage");
                String user=request.getParameter("txtUser");
                Product sp=new Product(code, name, pr, image);
                Cart cart=new Cart(sp);
                shop.addProduct(cart);
                List<Cart> Lcart=new ArrayList<>();
                Cart newcart=new Cart("1", user, code, name, pr, image);
                Lcart.add(newcart);
                session.setAttribute("SHOP", shop);
                RequestDispatcher rs=request.getRequestDispatcher("index_Cus.jsp");
                rs.forward(request, response);
            }else if(action.equals("View Cart")){
               
                RequestDispatcher rs=request.getRequestDispatcher("index_Cus_2.jsp");
                rs.forward(request, response);
            }else if(action.equals("Add More")){

                
                RequestDispatcher rs=request.getRequestDispatcher("index_Cus.jsp");
                rs.forward(request, response);
            }else if(action.equals("Remove")){
                String []list=request.getParameterValues("rmv");
                if(list!=null){
                HttpSession session=request.getSession();
                if(session !=null){
                    CartDao shop=(CartDao)session.getAttribute("SHOP");
                    if(shop!=null){
                    for(int i=0;i<list.length;i++){
                        shop.removeCart(list[i]);

                    }
                    request.setAttribute("SHOP", shop);
                    }
                }
                }
                    RequestDispatcher rs=request.getRequestDispatcher("index_Cus_2.jsp");
                    rs.forward(request, response);
                }
        
        }catch(Exception e){
        
        
        
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
