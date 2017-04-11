<%-- 
    Document   : InserSP
    Created on : Sep 29, 2016, 11:42:55 PM
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
      <div class="container">
        <h1>Insert Product</h1>
        <form action="ControllerProducts" method="Post" enctype="multipart/form-data"/>
            <input type="text" name="txtcode" placeholder="Code" size="30"/>
            <input type="text" name="txtname" placeholder="Name" size="30"/>
            <input type="text" name="txtprice" placeholder="Price" size="30"/>
            <input type="file" name="uploadFile"  />
            <input type="submit" name="action" value="INSERT"/>
        </form>
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
