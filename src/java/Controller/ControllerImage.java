/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Products;
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
public class ControllerImage extends HttpServlet {

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
                                String code=(String)params.get("txtCode");
                                String name=(String)params.get("txtName");
                                String price=(String)params.get("txtPrice");
                                int a=Integer.parseInt(price);
                                String image=(String)params.get("txtImage");
                                //Update  product
                                if(fileName.equals("")){
                               
                                Products sp=new Products();
                                sp.Update(code, name, price,image);
                                RequestDispatcher rd=request.getRequestDispatcher("product.jsp");
                                rd.forward(request, response);
                                
                                }else{
                                 // bat dau ghi file
                                 File savedFile=new File(RealPath);
                                item.write(savedFile);
                                //ket thuc ghi
                                Products sp=new Products();
                                sp.Update(code, name, price,"upload\\"+fileName);
                                
                                RequestDispatcher rd=request.getRequestDispatcher("product.jsp");
                                rd.forward(request, response);
                                }
                             
                               
 
                            }catch(Exception e){
                                RequestDispatcher rd=request.getRequestDispatcher("InformationError.jsp");
                                rd.forward(request, response);
                            }
                        }

                        }
                        }
            
            this.processRequest(request, response);
            
            
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
