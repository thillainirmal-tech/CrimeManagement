package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crimepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Au Register Forms by Colorlib</title>\n");
      out.write("\n");
      out.write("    <!-- Icons font CSS-->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/newmain.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins\">\n");
      out.write("        <div class=\"wrapper wrapper--w780\">\n");
      out.write("            <div class=\"card card-3\">\n");
      out.write("                <div class=\"card-heading\"></div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">Criminal Acquest Info</h2>\n");
      out.write("                    <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("                        \n");
      out.write("                        <a href=\"aquestnm.jsp\" class=\"btn btn--pill btn--green\"></a><br><br>\n");
      out.write("                        <a href=\"aquestnm.jsp\" class=\"btn btn--pill btn--green\"></a><br><br>\n");
      out.write("                        <a href=\"aquestnm.jsp\" class=\"btn btn--pill btn--green\"></a><br><br>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"p-t-10\">\n");
      out.write("                            <button class=\"btn btn--pill btn--green\" type=\"submit\">Exist</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    \n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/newglobal.js\"></script>\n");
      out.write("\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("\n");
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
