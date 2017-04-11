<%-- 
    Document   : index
    Created on : Sep 30, 2016, 10:01:00 AM
    Author     : phuoc
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Product"%>
<%@page import="Model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="templet/login/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="templet/index/css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="templet/index/css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div id="login"><a href="login.jsp">LOGIN</a></div>
         <section>
        <div  class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
          <thead>
            <tr>
              <th>Code</th>
              <th>Name</th>
              <th>Price</th>
              <th>Image</th>
              
            </tr>
          </thead>
        </table>
        </div>
        <div class="tbl-content">
            
            <table  cellpadding="0" cellspacing="0" border="0" >
            
            <%
            Products listsp=new Products();
            List<Product> list=listsp.list("");
            for(Product sp:list){
             out.println("<tr><td>"+sp.getCode()+"</td>"
                     + "<td>"+sp.getName()+"</td>"
                     + "<td>"+sp.getPrice()+"</td>"
                     + "<td><img src="+sp.getImage()+" width="+"80px"+" height="+"80px"+"></td></tr>");
            }
            
            %>      
        </table>
        </div>
       
         </section>
        <div class="made-with-love">
  Made with 
  <i>♥</i> by 
  <a target="_blank" href="http://codepen.io/nikhil8krishnan">Nikhil Krishnan</a>
</div>
         
      
       
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="templet/login/js/index.js" type="text/javascript"></script>
    <script src="templet/index/js/index.js" type="text/javascript"></script>
    </body>
</html>
