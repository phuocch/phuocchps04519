<%-- 
    Document   : InsertCustomer
    Created on : Oct 10, 2016, 11:53:37 PM
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
        <div class="wrapper1">
      <div class="container1">
        <h1>Insert Customer</h1>
        <form action="ControllerImageCustomer" method="Post" enctype="multipart/form-data"/>
            <input type="text" name="txtusername" placeholder="UserName" size="30"/>
            <input type="text" name="txpassword" placeholder="Password" size="30"/>
            <input type="text" name="txthoten" placeholder="Name" size="30"/>
            <input type="text" name="txtgioitinh" placeholder="Sex" size="30"/>
            <input type="text" name="txtemail" placeholder="Email" size="30"/>
             <input type="hidden" name="Register" value=""/> 
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
