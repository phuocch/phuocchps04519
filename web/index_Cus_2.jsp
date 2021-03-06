<%@page import="java.util.ArrayList"%>
<%@page import="entity.Cart"%>
<%@page import="dao.CartDao"%>
<%@page import="Model.Product"%>
<%@page import="java.util.List"%>
<%@page import="Model.Products"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Electronix Store</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link href="templet/WS/style.css" rel="stylesheet" type="text/css"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script src="templet/WS/js/boxOver.js" type="text/javascript"></script>

</head>
<body>
<div id="main_container">
  <div class="top_bar">
    <div class="top_search">
        <form action="ControllerProducts">  
      <div class="search_text"><a href="#">Advanced Search</a></div>
      <input type="text" class="search_input" name="txtname" />
      <input type="image" src="templet/WS/images/search.gif" class="search_bt" name="action" value="Searchcus" />
        </form>
    </div>
    <div class="languages">
      <div class="lang_text">Languages:</div>
      <a href="#" class="lang"><img src="templet/WS/images/en.gif" alt="" border="0" /></a>  </div>
  </div>
  <div id="header">
    <div id="logo"> <a href="#"><img src="templet/WS/images/logo.png" alt="" border="0" width="237" height="140" /></a> </div>
    <div class="oferte_content">
      <div class="top_divider"><img src="templet/WS/images/header_divider.png" alt="" width="1" height="164" /></div>
      <div class="oferta">
        <div class="oferta_content"> <img src="templet/WS/images/laptop.png" width="94" height="92" alt="" border="0" class="oferta_img" />
          <div class="oferta_details">
            <div class="oferta_title">Samsung GX 2004 LM</div>
            <div class="oferta_text"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>
            <a href="details.html" class="details">details</a> </div>
        </div>
        <div class="oferta_pagination"> <span class="current">1</span> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">5</a> </div>
      </div>
      <div class="top_divider"><img src="templet/WS/images/header_divider.png" alt="" width="1" height="164" /></div>
    </div>
    <!-- end of oferte_content-->
  </div>
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
          <li><a href="index_Cus1.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="#" class="nav2">Products</a></li>
        <li class="divider"></li>
        <li><a href="#" class="nav3">Specials</a></li>
        <li class="divider"></li>
        <li><a href="index_Cus.jsp" class="nav4">My account</a></li>
        <li class="divider"></li>
        <li><a href="InsertCustomer_1.jsp" class="nav4">Sign Up</a></li>
        <li class="divider"></li>
        <li><a href="login.jsp" class="nav5">Login</a></li>
        <li class="divider"></li>
        <li><a href="contact_1.jsp" class="nav6">Contact Us</a></li>
        <li class="divider"></li>
        <li class="currencies">Currencies
          <select>
            <option>US Dollar</option>
            <option>Euro</option>
          </select>
        </li>
      </ul>
      <div class="right_menu_corner"></div>
    </div>
    <!-- end of menu tab -->
    <div class="crumb_navigation"> Navigation: <span class="current">Home</span> </div>
    <div class="left_content">
      <div class="title_box">Categories</div>
      <ul class="left_menu">
        <li class="odd"><a href="#">Processors</a></li>
        <li class="even"><a href="#">Motherboards</a></li>
        <li class="odd"><a href="#">Desktops</a></li>
        <li class="even"><a href="#">Laptops &amp; Notebooks</a></li>
        <li class="odd"><a href="#">Processors</a></li>
        <li class="even"><a href="#">Motherboards</a></li>
        <li class="odd"><a href="#">Processors</a></li>
        <li class="even"><a href="#">Motherboards</a></li>
        <li class="odd"><a href="#">Desktops</a></li>
        <li class="even"><a href="#">Laptops &amp; Notebooks</a></li>
        <li class="odd"><a href="#">Processors</a></li>
        <li class="even"><a href="#">Motherboards</a></li>
      </ul>
      <div class="title_box">Special Products</div>
      <div class="border_box">
        <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
        <div class="product_img"><a href="details.html"><img src="images/laptop.png" alt="" border="0" /></a></div>
        <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
      </div>
      <div class="title_box">Newsletter</div>
      <div class="border_box">
        <input type="text" name="newsletter" class="newsletter_input" value="your email"/>
        <a href="#" class="join">join</a> </div>
      <div class="banner_adds"> <a href="#"><img src="templet/WS/images/bann2.jpg" alt="" border="0" /></a> </div>
    </div>
    <!-- end of left content ============================================= -->
    <div class="center_content">
      <div class="center_title_bar">Latest Products</div>
                 <c:set var="shop" value="${sessionScope.SHOP}"/>
                 <c:if test="${not empty shop}">
                <form action="ControllerCart">
                        <c:set var="count" value="0"/>
                         <c:set var="total" value="0"/>
                        <c:forEach var="rows" items="${shop}">
                        <c:set var="count" value="${count+1}"/>
                         <div class="prod_box">
                        <div class="top_prod_box"></div>
                        <div class="center_prod_box">
                            <div class="product_title"><a href="#">${rows.value.product.name}</a></div>
                            <div class="product_img"><a href="#"><img src="${rows.value.product.image}" alt="" border="0" width="80px" height="80px"/></a></div>
                            <div class="prod_price"><span class="reducec">${rows.value.product.price}</span> <span class="price">vnd</span></div>
                              <c:set var="money" value="${rows.value.product.price*rows.value.number}"/>
                            <div> ${rows.value.number}</div>
                            <div><input type="checkbox" name="rmv" value="${rows.value.product.code}"/></div>
                            <div>
                             <input type="submit" name="action" value="Remove"/>
                            </div>
                            
                            <c:set var="name" value="${rows.value.product.name}"/>
                            <c:set var="price" value="${rows.value.product.price}"/>
                            <c:set var="image" value="${rows.value.product.image}"/>
                            <c:set var="number" value="${rows.value.number}"/>
                            <c:set var="numbercart" value="${rows.value.numberCart}"/>
                            
                            <c:set var="total" value="${total+money}"/>
                        </div>
                        </div>
                        
                       </c:forEach>
                       
                         </c:if>
                        
                            
                          <div class="bottom_prod_box"></div>
                        <div class="prod_details_tab">
                            
                        </div>
                        
                </form>
    </div>
    <!-- end of center content ====================================================================================-->
    <div class="right_content">
      <div class="shopping_cart">
           <form action="ControllerCart">
                <input type="hidden" name="txtUser" value="${sessionScope.User}"/>
               <div class="cart_title">Welcom ${sessionScope.User},  <a href="index_1.jsp" title="header=[Checkout] body=[&nbsp;] fade=[on]">Exit</a></div>
        <div class="cart_details">  items: ${count} <br />
        <span class="border_cart"></span> Total: ${total} <span class="price">$</span> </div>
        <div class="cart_icon"><img src="${sessionScope.Image}" alt="" width="48" height="48" border="0" /></div>
        </form>
      </div>
      <div class="title_box">View Cart</div>
      <div class="border_box">
        <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
        <div class="product_img">
            <form action="ControllerCart">
                 <input type="hidden" name="txtname" value="${name}"/>
                  <input type="hidden" name="txtprice" value="${price}"/>
                   <input type="hidden" name="txtimage" value="${image}"/>
                    <input type="hidden" name="txtnumber" value="${number}"/>
                     <input type="hidden" name="txtnumbercart" value="${numbercart}"/>
               
                <input type="submit" name="action" value="Add More"/>
            </form>
        </div>
        <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
      </div>
      <div class="title_box">Manufacturers</div>
      <ul class="left_menu">
        <li class="odd"><a href="#">Sony</a></li>
        <li class="even"><a href="#">Samsung</a></li>
        <li class="odd"><a href="#">Daewoo</a></li>
        <li class="even"><a href="#">LG</a></li>
        <li class="odd"><a href="#">Fujitsu Siemens</a></li>
        <li class="even"><a href="#">Motorola</a></li>
        <li class="odd"><a href="#">Phillips</a></li>
        <li class="even"><a href="#">Beko</a></li>
      </ul>
      <div class="banner_adds"> <a href="#"><img src="templet/WS/images/bann1.jpg" alt="" border="0" /></a> </div>
    </div>
    <!-- end of right content -->
  </div>
  <!-- end of main content -->
  <div class="footer">
    <div class="left_footer"> <img src="templet/WS/images/footer_logo.png" alt="" width="170" height="49"/> </div>
    <div class="center_footer"> Template name. All Rights Reserved 2008<br />
      <a href="http://csscreme.com"><img src="templet/WS/images/csscreme.jpg" alt="csscreme" border="0" /></a><br />
      <img src="templet/WS/images/payment.gif" alt="" /> </div>
    <div class="right_footer"> <a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a href="#">rss</a> <a href="contact.html">contact us</a> </div>
  </div>
</div>
<!-- end of main_container -->
</body>
</html>
