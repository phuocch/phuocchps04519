<%-- 
    Document   : editCustomer
    Created on : Oct 12, 2016, 1:49:44 PM
    Author     : phuoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="templet/login/css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       <div class="wrapper2">
             <h1>Edit Customer</h1>
      <div class="container2">
       
        <div id="image2"><img src="${Cus.anh}" width="200px" height="200px"></div>
        <div id="formup">
        <form action="ControllerCustomers" method="Post" enctype="multipart/form-data">
            <input type="text" value="${Cus.username}" disabled="">
            <input type="hidden" value="${Cus.username}" name="txtusername">
                <input type="text" name="txtpassword" value="${Cus.password}">
                <input type="text" name="txthoten" value="${Cus.hoten}">
                <input type="text" name="txtgioitinh" value="${Cus.gioitinh}">
                <input type="text" name="txtemail" value="${Cus.email}">
                <input type="text" name="txtrole" value="${Cus.role}"> 
                <input type="hidden" name="txtanh" value="${Cus.anh}">
                <input type="file" name="uploadFile" />
                <input type="submit" name="action" value="EDIT" >
                
            </form>
        </div>        
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
                <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
                <script src="templet/login/js/index.js" type="text/javascript"></script>
    </body>
</html>
