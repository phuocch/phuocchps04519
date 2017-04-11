/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Products;
import dao.CustomerDAO;
import entity.Customer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author phuoc
 */
public class ControllerImageCustomerIndex extends HttpServlet {

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
                    System.out.println("path"+fileName);
                    String RealPath=getServletContext().getRealPath("/")+"upload\\"+fileName;
                    System.out.println("Rpath"+RealPath);
                    File savedFile=new File(RealPath);
                    item.write(savedFile);
                    String username=(String)params.get("txtusername");
                    String password=(String)params.get("txpassword");
                    String hoten=(String)params.get("txthoten");
                    String gioitinh=(String)params.get("txtgioitinh");
                    String email=(String)params.get("txtemail");
                    String role="false";
                    Customer cus=new Customer(username, password, hoten, gioitinh, email, role, "upload\\"+fileName);
                   
                    CustomerDAO.ThemKhachHang(cus);
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);
                }catch(Exception e){
                e.printStackTrace();
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
