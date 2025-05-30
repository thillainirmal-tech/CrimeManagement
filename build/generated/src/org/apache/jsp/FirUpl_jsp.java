package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FirUpl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"description\" content=\"Demo for the tutorial: Styling and Customizing File Inputs the Smart Way\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"cutom file input, styling, label, cross-browser, accessible, input type file\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Osvaldas Valutis for Codrops\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize_2.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo_2.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component_1.css\" />\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     <script>(function(e,t,n){var r=e.querySelectorAll(\"html\")[0];r.className=r.className.replace(/(^|\\s)no-js(\\s|$)/,\"$1js$2\")})(document,window,0);</script>\n");
      out.write("                <style>\n");
      out.write(".button {\n");
      out.write("  padding: 15px 25px;\n");
      out.write("  font-size: 15px;\n");
      out.write("  text-align: center;\n");
      out.write("  cursor: pointer;\n");
      out.write("  outline: none;\n");
      out.write("  color: #000000;\n");
      out.write("  background-color: #F5B7B1;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  box-shadow: 0 9px #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {background-color: #F5B7B1}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  background-color: #F5B7B1;\n");
      out.write("  box-shadow: 0 5px #666;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        </head>\n");
      out.write("        <script>\n");
      out.write("            function valid()\n");
      out.write("            {\n");
      out.write("                var a1=document.form1.file1.value;\n");
      out.write("                \n");
      out.write("                if(a1==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Choose file\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        ");

        HttpSession se=request.getSession();
        
        String s1=request.getParameter("uname");
        String s2=request.getParameter("cage");
        String s3=request.getParameter("cadd");
        String c1=request.getParameter("c1");
        String c2=request.getParameter("c2");
        String c3=request.getParameter("c3");

        String c4=request.getParameter("c4");
        System.out.println(s1+"....."+s2+"//////"+s3);
          System.out.println(c1+"....."+c2+"//////"+c3+"//////"+c4);
        
        se.setAttribute("uname", s1);
        se.setAttribute("cage", s2);
        se.setAttribute("cadd", s3);
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("         <form action=\"FirUpload\" method=\"post\" name=\"form1\" id=\"form1\" enctype=\"multipart/form-data\" onsubmit=\"return valid()\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<header class=\"codrops-header\">\n");
      out.write("                            <h1><font size=\"8\" face=\"Californian FB\"> Upload Page</font></h1>\n");
      out.write("\t\t\t \t\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("                           \n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t<input type=\"file\" name=\"file1\" id=\"file-5\" class=\"inputfile inputfile-4\" data-multiple-caption=\"{count} files selected\" multiple />\n");
      out.write("                                        <label for=\"file-5\"><figure><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"17\" viewBox=\"0 0 20 17\"></svg></figure> <span>Choose a file&hellip;</span></label><br>\n");
      out.write("                                        <button name=\"Submit\" class=\"button\">Upload</button>\n");
      out.write("                             \n");
      out.write("                                 </div>\n");
      out.write("                         \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/custom-file-input.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- // If you'd like to use jQuery, check out js/jquery.custom-file-input.js\n");
      out.write("\t\t<script src=\"js/jquery-v1.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.custom-file-input.js\"></script>\n");
      out.write("\t\t-->\n");
      out.write("                </form>\n");
      out.write("    </body>\n");
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
}
