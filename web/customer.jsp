<%-- 
    Document   : customer
    Created on : Sep 28, 2016, 12:56:16 PM
    Author     : phuoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="templet/login/css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <div class="wrapper">
      <div class="container">
        <h1>Welcom, ${sessionScope.User}</h1>
      </div>
      <ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
            </div>
        <div><a href="index.jsp">Home</a></div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
         <script src="templet/login/js/index.js" type="text/javascript"></script>
    </body>
    
            
</html>
