<%-- 
    Document   : CustomerDao
    Created on : Oct 7, 2016, 3:55:05 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <div id="product">
        <form action="ControllerCustomers">
            Nhap username:<input type="text" name="txtusername">
            <input type="submit" name="action" value="FIND">
            <a href="InsertCustomer.jsp">Insert</a>
        </form>
        </div>
         <section>
        <div  class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
          <thead>
            <tr>
              <th>Image</th>   
              <th>UserName</th>
              <th>PassWord</th>
              <th>Name</th>
              <th>Sex</th>
              <th>Email</th>
              <th>Role</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
        </table>
        </div>
        <div class="tbl-content">
        <table  cellpadding="0" cellspacing="0" border="0">
            
             <c:forEach var="rows" items="${listKH}">
                     
                    <tr>
                        <td><img src="${rows.anh}" width="80px" height="80px"></td> 
                        <td>${rows.getUsername()}</td>
                        <td>${rows.password}</td>
                        <td>${rows.hoten}</td>
                        <td>${rows.gioitinh}</td>
                        <td>${rows.email}</td>
                        <td>${rows.role}</td>
                     
                        <c:url var="edit" value="ControllerCustomers">
                            <c:param name="action" value="Edit"/>
                            <c:param name="txtusername" value="${rows.username}"/>
                            <c:param name="txtpassword" value="${rows.password}"/>
                            <c:param name="txthoten" value="${rows.hoten}"/>
                            <c:param name="txtgioitinh" value="${rows.gioitinh}"/>
                            <c:param name="txtemail" value="${rows.email}"/>
                            <c:param name="txtrole" value="${rows.role}"/> 
                            <c:param name="txtanh" value="${rows.anh}"/>
                        </c:url>
                        <td><a href="${edit}">Edit</a></td>
                        <td>
                            <form action="ControllerCustomers">
                            <input type="hidden" name="txtusername" value="${rows.username}">
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
