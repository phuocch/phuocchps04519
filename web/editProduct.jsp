<%-- 
    Document   : editProduct
    Created on : Sep 30, 2016, 10:41:25 AM
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
        <div class="wrapper">
             <h1>Edit Product</h1>
      <div class="container">
       
        <div id="image"><img src="${SP.image}" width="200px" height="200px"></div>
        <div id="formup">
        <form action="ControllerImage" method="Post" enctype="multipart/form-data">
            <input type="text" value="${SP.code}" disabled="">
                <input type="hidden" name="txtCode" value="${SP.code}">
                <input type="text" name="txtName" value="${SP.name}">
                <input type="text" name="txtPrice" value="${SP.price}">
                <input type="hidden" name="txtImage" value="${SP.image}">
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
