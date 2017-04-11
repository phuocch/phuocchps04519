/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import Model.Products;
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
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author phuoc
 */
public class ControllerProducts extends HttpServlet {
  
  
   
   
 
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
            if(action.equals("FIND")){
                String productname=request.getParameter("txtname");
                Products pr=new Products();
                List<Product> list=new ArrayList<Product>();
                list=pr.list(productname);
                request.setAttribute("listSP",list);
                request.setAttribute("proname", productname);
                RequestDispatcher rd=request.getRequestDispatcher("product.jsp");
                rd.forward(request, response);
            }else if(action.equals("Delete")){
                String code=request.getParameter("txtcode");
                Products sp=new Products();
                sp.Delete(code);
                RequestDispatcher rd=request.getRequestDispatcher("ControllerProducts?action=Find&txtname=");
                rd.forward(request, response);
            
            }else if(action.equals("Edit")){
                String code=request.getParameter("txtcode");
                String name=request.getParameter("txtname");
                String price=request.getParameter("txtprice");
                String image=request.getParameter("txtimage");
                Product sp=new Product(code, name, price, image);      
                request.setAttribute("SP", sp);
                
                RequestDispatcher rd=request.getRequestDispatcher("editProduct.jsp");
                rd.forward(request, response);
            
            }else if(action.equals("Search")){
                String productname=request.getParameter("txtname");
                Products pr=new Products();
                List<Product> list=new ArrayList<Product>();
                list=pr.list(productname);
                request.setAttribute("listSP",list);
                request.setAttribute("proname", productname);
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            
            
            }else if(action.equals("Searchcus")){
                String productname=request.getParameter("txtname");
                Products pr=new Products();
                List<Product> list=new ArrayList<Product>();
                list=pr.list(productname);
                request.setAttribute("listSP",list);
                request.setAttribute("proname", productname);
                RequestDispatcher rd=request.getRequestDispatcher("index_Cus1.jsp");
                rd.forward(request, response);
            }
     
        }catch(Exception e){
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
            this.processRequest(request, response);
                 
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
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
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
                    //System.out.println("upload\\"+fileName);
                    //insert Product
                    String code=(String)params.get("txtcode");
                    String name=(String)params.get("txtname");
                    String price=(String)params.get("txtprice"); 
                    Products sp=new Products();
                    sp.InsertProduct(code, name, price, "upload\\"+fileName);
                    RequestDispatcher rd=request.getRequestDispatcher("product.jsp");
                    rd.forward(request, response);
                }catch(Exception e){
                e.printStackTrace();
                }
            }
               
            }
           
            
            
            
            }
            //this.processRequest(request, response);
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
