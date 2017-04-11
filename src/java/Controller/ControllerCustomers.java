/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customers;
import Model.Products;
import dao.CartDao;
import dao.CustomerDAO;
import entity.Cart;
import entity.Customer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author phuoc
 */
public class ControllerCustomers extends HttpServlet {

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
            if(action.equals("Login")){   
             String user=request.getParameter("txtId");
             String pass=request.getParameter("txtpass");
               Customers ct=new  Customers();
               String anh=ct.anh(user);
               boolean check=ct.checkLogin(user,pass);
               String url="error.jsp";
               if(check){
                   if(ct.role(user)){
                     RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
                     rd.forward(request, response);
                   }else{
                      
                   url="index_Cus_2.jsp";
                   HttpSession session=request.getSession(true);
                   session.setAttribute("User", user);
                   session.setAttribute("Image", anh);
//                   <%
                 
                    CartDao listsp=new CartDao();
                    List<Cart> list=CartDao.layDanhSachCart(user);
                    session.setAttribute("list", list);
//      %>
                    
                   }
                
                }
                RequestDispatcher rd=request.getRequestDispatcher(url);
                rd.forward(request, response);
            
               }else if(action.equals("FIND")){
                String username=request.getParameter("txtusername");
                CustomerDAO cusdao=new CustomerDAO();
                List<Customer> list=new ArrayList<Customer>();
                list=cusdao.layDanhSachKhachHang(username);
                request.setAttribute("listKH", list);
                RequestDispatcher rd=request.getRequestDispatcher("CustomerDao.jsp");
                rd.forward(request, response);
            
            }else if(action.equals("DELETE")){
                String username=request.getParameter("txtusername");
                boolean delete=CustomerDAO.XoaKhachHang(username);
                if(delete){
                RequestDispatcher rd=request.getRequestDispatcher("CustomerDao.jsp");
                rd.forward(request, response);
                
                    }
            
            }else if(action.equals("Edit")){
                 String username=request.getParameter("txtusername");
                 String password=request.getParameter("txtpassword");
                 String hoten=request.getParameter("txthoten");
                 String gioitinh=request.getParameter("txtgioitinh");
                 String email=request.getParameter("txtemail");
                 String role=request.getParameter("txtrole");
                 String anh=request.getParameter("txtanh");
                 Customer cus=new Customer(username, password, hoten, gioitinh, email, role, anh);
                 request.setAttribute("Cus", cus);
                 RequestDispatcher rd=request.getRequestDispatcher("editCustomer.jsp");
                 rd.forward(request, response);
            
            }
            }    
            catch(Exception e)
             {
                e.printStackTrace();

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
            boolean isMultipart=ServletFileUpload.isMultipartContent(request);
                        if(!isMultipart){

                        }else{
                        FileItemFactory factory=new DiskFileItemFactory();
                        ServletFileUpload upload=new ServletFileUpload(factory);
                        List items=null;
                            try{
                                items=upload.parseRequest(request);
                            }catch(Exception e){
                            e.printStackTrace();
                            }
                        Iterator iter=items.iterator();
                        Hashtable params=new Hashtable();
                        String fileName=null;
                        while(iter.hasNext()){
                        FileItem item=(FileItem)iter.next();
                        if(item.isFormField()){
                        params.put(item.getFieldName(), item.getString());
                        }else{

                            try{
                                String itemName=item.getName();
                                fileName=itemName.substring(itemName.lastIndexOf("\\")+1);
                                String RealPath=getServletContext().getRealPath("/")+"upload\\"+fileName;
                                String username=(String)params.get("txtusername");
                                String password=(String)params.get("txtpassword");
                                String hoten=(String)params.get("txthoten");
                                String gioitinh=(String)params.get("txtgioitinh");
                                String email=(String)params.get("txtemail");
                                String role=(String)params.get("txtrole"); 
                                String anh=(String)params.get("txtanh");
                                //Update  product
                                if(fileName.equals("")){
                               
                                Customer Cus=new Customer(username, password, hoten, gioitinh, email, role, anh);
                                CustomerDAO.SuaThongTinKhachHang(Cus);
                                RequestDispatcher rd=request.getRequestDispatcher("CustomerDao.jsp");
                                rd.forward(request, response);
                                
                                }else{
                                 // bat dau ghi file
                                 File savedFile=new File(RealPath);
                                item.write(savedFile);
                                //ket thuc ghi
                                 
                                Customer Cus=new Customer(username, password, hoten, gioitinh, email, role,"upload\\"+fileName );
                                CustomerDAO.SuaThongTinKhachHang(Cus);
                                
                                RequestDispatcher rd=request.getRequestDispatcher("CustomerDao.jsp");
                                rd.forward(request, response);
                                }
                             
                               
 
                            }catch(Exception e){
                                System.out.println(e);
                                RequestDispatcher rd=request.getRequestDispatcher("InformationError.jsp");
                                rd.forward(request, response);
                            }
                        }

                        }
                        }
            
        
    
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
