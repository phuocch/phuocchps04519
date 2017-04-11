package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Product;
import java.util.List;
import Model.Products;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Electronix Store</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("<link href=\"templet/WS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<!--[if IE 6]>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<script src=\"templet/WS/js/boxOver.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"main_container\">\n");
      out.write("  <div class=\"top_bar\">\n");
      out.write("    <div class=\"top_search\">\n");
      out.write("        <form action=\"ControllerProducts\">  \n");
      out.write("      <div class=\"search_text\"><a href=\"#\">Advanced Search</a></div>\n");
      out.write("      <input type=\"text\" class=\"search_input\" name=\"txtname\" />\n");
      out.write("      <input type=\"image\" src=\"templet/WS/images/search.gif\" class=\"search_bt\" name=\"action\" value=\"Search\" />\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"languages\">\n");
      out.write("      <div class=\"lang_text\">Languages:</div>\n");
      out.write("      <a href=\"#\" class=\"lang\"><img src=\"templet/WS/images/en.gif\" alt=\"\" border=\"0\" /></a> <a href=\"#\" class=\"lang\"><img src=\"templet/WS/images/de.gif\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div id=\"logo\"> <a href=\"#\"><img src=\"templet/WS/images/logo.png\" alt=\"\" border=\"0\" width=\"237\" height=\"140\" /></a> </div>\n");
      out.write("    <div class=\"oferte_content\">\n");
      out.write("      <div class=\"top_divider\"><img src=\"templet/WS/images/header_divider.png\" alt=\"\" width=\"1\" height=\"164\" /></div>\n");
      out.write("      <div class=\"oferta\">\n");
      out.write("        <div class=\"oferta_content\"> <img src=\"templet/WS/images/laptop.png\" width=\"94\" height=\"92\" alt=\"\" border=\"0\" class=\"oferta_img\" />\n");
      out.write("          <div class=\"oferta_details\">\n");
      out.write("            <div class=\"oferta_title\">Samsung GX 2004 LM</div>\n");
      out.write("            <div class=\"oferta_text\"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>\n");
      out.write("            <a href=\"details.html\" class=\"details\">details</a> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"oferta_pagination\"> <span class=\"current\">1</span> <a href=\"#\">2</a> <a href=\"#\">3</a> <a href=\"#\">4</a> <a href=\"#\">5</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"top_divider\"><img src=\"templet/WS/images/header_divider.png\" alt=\"\" width=\"1\" height=\"164\" /></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of oferte_content-->\n");
      out.write("  </div>\n");
      out.write("  <div id=\"main_content\">\n");
      out.write("    <div id=\"menu_tab\">\n");
      out.write("      <div class=\"left_menu_corner\"></div>\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("        <li><a href=\"#\" class=\"nav1\"> Home</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"#\" class=\"nav2\">Products</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"#\" class=\"nav3\">Specials</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"#\" class=\"nav4\">My account</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"InsertCustomer_1.jsp\" class=\"nav4\">Sign Up</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"login.jsp\" class=\"nav5\">Login</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"contact.jsp\" class=\"nav6\">Contact Us</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li class=\"currencies\">Currencies\n");
      out.write("          <select>\n");
      out.write("            <option>US Dollar</option>\n");
      out.write("            <option>Euro</option>\n");
      out.write("          </select>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"right_menu_corner\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of menu tab -->\n");
      out.write("    <div class=\"crumb_navigation\"> Navigation: <span class=\"current\">Home</span> </div>\n");
      out.write("    <div class=\"left_content\">\n");
      out.write("      <div class=\"title_box\">Categories</div>\n");
      out.write("      <ul class=\"left_menu\">\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Processors</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Motherboards</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Desktops</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Laptops &amp; Notebooks</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Processors</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Motherboards</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Processors</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Motherboards</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Desktops</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Laptops &amp; Notebooks</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Processors</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Motherboards</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"title_box\">Special Products</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("        <div class=\"product_img\"><a href=\"details.html\"><img src=\"images/laptop.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"title_box\">Newsletter</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <input type=\"text\" name=\"newsletter\" class=\"newsletter_input\" value=\"your email\"/>\n");
      out.write("        <a href=\"#\" class=\"join\">join</a> </div>\n");
      out.write("      <div class=\"banner_adds\"> <a href=\"#\"><img src=\"templet/WS/images/bann2.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of left content ============================================= -->\n");
      out.write("    <div class=\"center_content\">\n");
      out.write("      <div class=\"center_title_bar\">Latest Products</div>\n");
      out.write("      ");

       Products listsp=new Products();
       List<Product> list=listsp.list("");
       request.setAttribute("list", list);
      
      out.write("\n");
      out.write("     ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <!-- end of center content ====================================================================================-->\n");
      out.write("    <div class=\"right_content\">\n");
      out.write("      <div class=\"shopping_cart\">\n");
      out.write("        <div class=\"cart_title\">Shopping cart</div>\n");
      out.write("        <div class=\"cart_details\"> 0 items <br />\n");
      out.write("          <span class=\"border_cart\"></span> Total: <span class=\"price\">0$</span> </div>\n");
      out.write("        <div class=\"cart_icon\"><a href=\"#\" title=\"header=[Checkout] body=[&nbsp;] fade=[on]\"></a></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"title_box\">What?s new</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("        <div class=\"product_img\"><a href=\"details.html\"><img src=\"images/p2.gif\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"title_box\">Manufacturers</div>\n");
      out.write("      <ul class=\"left_menu\">\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Sony</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Samsung</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Daewoo</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">LG</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Fujitsu Siemens</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Motorola</a></li>\n");
      out.write("        <li class=\"odd\"><a href=\"#\">Phillips</a></li>\n");
      out.write("        <li class=\"even\"><a href=\"#\">Beko</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"banner_adds\"> <a href=\"#\"><img src=\"templet/WS/images/bann1.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of right content -->\n");
      out.write("  </div>\n");
      out.write("  <!-- end of main content -->\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"left_footer\"> <img src=\"templet/WS/images/footer_logo.png\" alt=\"\" width=\"170\" height=\"49\"/> </div>\n");
      out.write("    <div class=\"center_footer\"> Template name. All Rights Reserved 2008<br />\n");
      out.write("      <a href=\"http://csscreme.com\"><img src=\"templet/WS/images/csscreme.jpg\" alt=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("      <img src=\"templet/WS/images/payment.gif\" alt=\"\" /> </div>\n");
      out.write("    <div class=\"right_footer\"> <a href=\"#\">home</a> <a href=\"#\">about</a> <a href=\"#\">sitemap</a> <a href=\"#\">rss</a> <a href=\"contact.html\">contact us</a> </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- end of main_container -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("rows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("      <div class=\"prod_box\">\n");
          out.write("        <div class=\"top_prod_box\"></div>\n");
          out.write("        <div class=\"center_prod_box\">\n");
          out.write("          <div class=\"product_title\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></div>\n");
          out.write("          <div class=\"product_img\"><a href=\"#\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" border=\"0\" width=\"80px\" height=\"80px\"/></a></div>\n");
          out.write("          <div class=\"prod_price\"><span class=\"reducec\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span> <span class=\"price\">vnd</span></div>\n");
          out.write("        </div>\n");
          out.write("        <div class=\"bottom_prod_box\"></div>\n");
          out.write("        <div class=\"prod_details_tab\"></div>\n");
          out.write("      </div>\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
