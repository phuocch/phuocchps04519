package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Cart;
import dao.CartDao;
import Model.Product;
import java.util.List;
import Model.Products;

public final class index_005fCus_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("         <!--\n");
      out.write("            function getConfirmation(){\n");
      out.write("               var retVal = confirm(\"Do you want to continue ?\");\n");
      out.write("               if( retVal == true ){\n");
      out.write("                  document.write (\"User wants to continue!\");\n");
      out.write("                  return true;\n");
      out.write("               }\n");
      out.write("               else{\n");
      out.write("                  Document.write (\"User does not want to continue!\");\n");
      out.write("                  return false;\n");
      out.write("               }\n");
      out.write("            }\n");
      out.write("         //-->\n");
      out.write("      </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"main_container\">\n");
      out.write("  <div class=\"top_bar\">\n");
      out.write("    <div class=\"top_search\">\n");
      out.write("        <form action=\"ControllerProducts\">  \n");
      out.write("      <div class=\"search_text\"><a href=\"#\">Advanced Search</a></div>\n");
      out.write("      <input type=\"text\" class=\"search_input\" name=\"txtname\" />\n");
      out.write("      <input type=\"image\" src=\"templet/WS/images/search.gif\" class=\"search_bt\" name=\"action\" value=\"Searchcus\" />\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"languages\">\n");
      out.write("      <div class=\"lang_text\">Languages:</div>\n");
      out.write("      <a href=\"#\" class=\"lang\"><img src=\"templet/WS/images/en.gif\" alt=\"\" border=\"0\" /></a>  </div>\n");
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
      out.write("          <li><a href=\"index_Cus1.jsp\" class=\"nav1\"> Home</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"#\" class=\"nav2\">Products</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"#\" class=\"nav3\">Specials</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"index_Cus.jsp\" class=\"nav4\">My account</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"InsertCustomer_1.jsp\" class=\"nav4\">Sign Up</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"login.jsp\" class=\"nav5\">Login</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"contact_1.jsp\" class=\"nav6\">Contact Us</a></li>\n");
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
      out.write("                 ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                          <div class=\"bottom_prod_box\"></div>\n");
      out.write("                        <div class=\"prod_details_tab\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                </form>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of center content ====================================================================================-->\n");
      out.write("    <div class=\"right_content\">\n");
      out.write("      <div class=\"shopping_cart\">\n");
      out.write("           <form action=\"ControllerCart\">\n");
      out.write("                <input type=\"hidden\" name=\"txtUser\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("               <div class=\"cart_title\">Welcom ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(",  <a href=\"index_1.jsp\" title=\"header=[Checkout] body=[&nbsp;] fade=[on]\"> <input type=\"button\" value=\"Exit\" onclick=\"getConfirmation();\" /></a></div>\n");
      out.write("        <div class=\"cart_details\">  items: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br />\n");
      out.write("        <span class=\"border_cart\"></span> Total: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <span class=\"price\">$</span> </div>\n");
      out.write("        <div class=\"cart_icon\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" width=\"48\" height=\"48\" border=\"0\" /></div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"title_box\">View Cart</div>\n");
      out.write("      <div class=\"border_box\">\n");
      out.write("        <div class=\"product_title\"><a href=\"details.html\">Motorola 156 MX-VL</a></div>\n");
      out.write("        <div class=\"product_img\">\n");
      out.write("            <form action=\"ControllerCart\">\n");
      out.write("                 <input type=\"hidden\" name=\"txtname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                  <input type=\"hidden\" name=\"txtprice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                   <input type=\"hidden\" name=\"txtimage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"txtnumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                     <input type=\"hidden\" name=\"txtnumbercart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numbercart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("               \n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"Add More\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("shop");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.SHOP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty shop}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <form action=\"ControllerCart\">\n");
        out.write("                        ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                         ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                       \n");
        out.write("                         ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("count");
    _jspx_th_c_set_1.setValue(new String("0"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_2.setVar("total");
    _jspx_th_c_set_2.setValue(new String("0"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("rows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                         <div class=\"prod_box\">\n");
          out.write("                        <div class=\"top_prod_box\"></div>\n");
          out.write("                        <div class=\"center_prod_box\">\n");
          out.write("                            <div class=\"product_title\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></div>\n");
          out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" border=\"0\" width=\"80px\" height=\"80px\"/></a></div>\n");
          out.write("                            <div class=\"prod_price\"><span class=\"reducec\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span> <span class=\"price\">vnd</span></div>\n");
          out.write("                              ");
          if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            <div> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                            <div><input type=\"checkbox\" name=\"rmv\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></div>\n");
          out.write("                            <div>\n");
          out.write("                             <input type=\"submit\" name=\"action\" value=\"Remove\"/>\n");
          out.write("                            </div>\n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_set_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_set_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_set_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        </div>\n");
          out.write("                        \n");
          out.write("                       ");
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

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_3.setVar("count");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_4.setVar("money");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.price*rows.value.number}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_5.setVar("name");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_6.setVar("price");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_7.setVar("image");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.product.image}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_8.setVar("number");
    _jspx_th_c_set_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.number}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_9.setVar("numbercart");
    _jspx_th_c_set_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.value.numberCart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }

  private boolean _jspx_meth_c_set_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_10 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_10.setPageContext(_jspx_page_context);
    _jspx_th_c_set_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_10.setVar("total");
    _jspx_th_c_set_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total+money}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_10 = _jspx_th_c_set_10.doStartTag();
    if (_jspx_th_c_set_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_10);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_10);
    return false;
  }
}
