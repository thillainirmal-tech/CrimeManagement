package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"css/mainmain.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-wrapper bg-blue p-t-100 p-b-100 font-robo\">\n");
      out.write("        <div class=\"wrapper wrapper--w680\">\n");
      out.write("            <div class=\"card card-1\">\n");
      out.write("                <div class=\"card-heading\"></div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">Registration Info</h2>\n");
      out.write("                    <form action=\"registeration\" method=\"POST\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-1\" type=\"text\" required=\"enter fields\" placeholder=\"NAME\" name=\"username\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"input--style-1 js-datepicker\" type=\"text\" required=\"enter fields\" placeholder=\"PASSWORD\" name=\"password\">\n");
      out.write("                                    <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <div class=\"rs-select2 js-select-simple select--no-search\">\n");
      out.write("                                        <select name=\"gender\" required=\"enter fields\">\n");
      out.write("                                            <option disabled=\"disabled\" selected=\"selected\">GENDER</option>\n");
      out.write("                                            <option>Male</option>\n");
      out.write("                                            <option>Female</option>\n");
      out.write("                                            <option>Other</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"select-dropdown\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"rs-select2 js-select-simple select--no-search\">\n");
      out.write("                                <select name=\"class\" required=\"enter fields\">\n");
      out.write("                                    <option disabled=\"disabled\" selected=\"selected\">CLASS</option>\n");
      out.write("                                    <option>Class 1</option>\n");
      out.write("                                    <option>Class 2</option>\n");
      out.write("                                    <option>Class 3</option>\n");
      out.write("                                </select>\n");
      out.write("                                <div class=\"select-dropdown\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"input--style-1\" type=\"text\" required=\"enter fields\" placeholder=\"EMAIL ID\" name=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"p-t-20\">\n");
      out.write("                            <button class=\"btn btn--radius btn--green\" type=\"submit\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/mainglobal.js\"></script>\n");
      out.write("\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->\n");
      out.write("\n");
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
