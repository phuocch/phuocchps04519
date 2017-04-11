<%-- 
    Document   : product
    Created on : Sep 28, 2016, 12:57:08 PM
    Author     : phuoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="templet/index/css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="templet/index/css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <div id="product">
        <form action="ControllerProducts">
         Product Name: <input type="text" name="txtname">
         <input type="submit" name="action" value="FIND">
         <a href="InsertSP.jsp">Insert</a>
        </form>
        </div>
        <section>
        <div  class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
          <thead>
            <tr>
              <th>Code</th>
              <th>Name</th>
              <th>Price</th>
              <th>Image</th>
              <th></th>
              <th></th>
              
            </tr>
          </thead>
        </table>
        </div>
            
         <div class="tbl-content">
       
        <table cellpadding="0" cellspacing="0" border="0" >
                    
                <c:forEach var="rows" items="${listSP}">
                     
                    <tr>
                        <td>${rows.code}</td>
                        <td>${rows.name}</td>
                        <td>${rows.price}</td>
                        <td><img src="${rows.image}" width="80px" height="80px"></td>

                        <c:url var="edit" value="ControllerProducts">
                            <c:param name="action" value="Edit"/>
                            <c:param name="txtcode" value="${rows.code}"/>
                            <c:param name="txtname" value="${rows.name}"/>
                            <c:param name="txtprice" value="${rows.price}"/>
                            <c:param name="txtimage" value="${rows.image}"/>
                        </c:url>
                        <td><a href="${edit}">Edit</a></td>
                        <td>
                            <form action="ControllerProducts">
                            <input type="hidden" name="txtcode" value="${rows.code}">
                            <input class="Delete" type="submit"  name="action" value="DELETE">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            </div>
        </section>
        <div class="made-with-love">
  Made with 
  <i>♥</i> by 
  <a target="_blank" href="http://codepen.io/nikhil8krishnan">Nikhil Krishnan</a>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="templet/index/js/index.js" type="text/javascript"></script>
    </body>
</html>
