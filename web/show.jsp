<%-- 
    Document   : show
    Created on : Oct 17, 2016, 1:16:44 AM
    Author     : phuoc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Cart"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your shop cart</h1>
        <%
        List<Cart> a= new ArrayList<>();
        a=(List<Cart>)request.getAttribute("SHOP");
        request.setAttribute("NEWSHOP", a);
        %>
        <c:set var="shop" value="${sessionScope.SHOP}"/>
        <c:if test="${not empty shop}">
            <table border="1">
                <thead>
                    <tr>
                        <th>No.</th>
                        <th>Code</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                <form action="ControllerCart">
                    <c:set var="count" value="0"/>
                    <c:forEach var="rows" items="${shop}">
                        <c:set var="count" value="${count+1}"/>
                        <tr>
                            <td>${count}</td>
                            <td>${rows.value.product.code}</td>
                            <td>${rows.value.product.name}</td>
                            <td>${rows.value.product.price}</td>
                            <td>${rows.value.number}</td> 
                            <td><input type="checkbox" name="rmv" value="${rows.value.product.code}"/></td>
                        </tr>
                       
                    </c:forEach>
                         <tr>
                             <c:url var="add" value="ControllerCart">
                                 <c:param name="action" value="Add More"/>
                             </c:url>
                             <td><a href="${add}">Add More</a></td>
                             <td><input type="submit" name="action" value="Remove"/></td>
                        </tr>
                </form>
                    
                </tbody>
               
            </table>
        </c:if>
    </body>
</html>
