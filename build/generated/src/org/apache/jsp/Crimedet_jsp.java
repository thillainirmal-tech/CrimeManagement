package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Crimedet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("\t\t<title>Student information</title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Sticky Table Headers Revisited: Creating functional and flexible sticky table headers\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"Sticky Table Headers Revisited\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Codrops\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write("\t\t<!--[if IE]>\n");
      out.write("  \t\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("        <style>\n");
      out.write("  .button {\n");
      out.write("  display: inline-block;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  background-color: #000000;\n");
      out.write("  border: none;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 20px;\n");
      out.write("  padding: 5px;\n");
      out.write("  width: 200px;\n");
      out.write("  transition: all 0.5s;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span {\n");
      out.write("  cursor: pointer;\n");
      out.write("  display: inline-block;\n");
      out.write("  position: relative;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span:after {\n");
      out.write("  content: '\\00bb';\n");
      out.write("  position: absolute;\n");
      out.write("  opacity: 0;\n");
      out.write("  top: 0;\n");
      out.write("  right: -20px;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span {\n");
      out.write("  padding-right: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span:after {\n");
      out.write("  opacity: 1;\n");
      out.write("  right: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<body align=\"center\">\n");
      out.write("             <form name=\"formm\" action=\"SerBk.jsp\" method=\"POST\" onsubmit=\"return one()\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Top Navigation -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<header>\n");
      out.write("                            <h1>Student Status</h1>\t\n");
      out.write("                         </header>\n");
      out.write("                       \n");
      out.write("    <nav class=\"codrops-demos\">\n");
      out.write("        <a>Student Regno :  <input type=\"text\" name=\"stdrg\" value=\"\"/></a>&nbsp;&nbsp;&nbsp;&nbsp;<br><br>\n");
      out.write("<!--      <a>Book Name  :  <input type=\"text\" name=\"bknm\" value=\"\"/></a>&nbsp;&nbsp;&nbsp;&nbsp;<br><br>-->\n");
      out.write("        <button class=\"button\" type=\"submit\" name=\"Student Status\" style=\"vertical-align:middle\"><span>Student Status </span></button>\n");
      out.write("<!--        <button class=\"button\" type=\"submit\" name=\"Book Search\" style=\"vertical-align:middle\" onclick=\"form.action='SerBk.jsp';\"><span>Book Search </span></button>-->\n");
      out.write("        \n");
      out.write("    </nav>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"component\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                    <th>Renewal</th>\n");
      out.write("                                                    <th>Student RegNo</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Book Name</th>\n");
      out.write("                                                        <th>Book ID</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Department of Book</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Taken-Date</th>\n");
      out.write("                                                        <th>Renewal-Date</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Count</th>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("                    ");

                        try{
                    String d1=request.getParameter("stdrg");
                
                    String query="SELECT * FROM stdupbk WHERE stdrg='"+d1+"' ";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery(query);
                    while(rs1.next())
                     
                    
                                                 {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"radio\" name=\"bk1\" value=\"");
      out.print(rs1.getString("sno"));
      out.write("\" > </td>\n");
      out.write("                        \n");
      out.write("                        <td>");
      out.print(rs1.getString("stdrg") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("bknm") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("bkid") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("bkdpt") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("bdate") );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs1.getString("rdate") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("bkcnt") );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    
                    }
                    
                     
                        }catch(Exception e){
                        
                        System.out.println(e);
                        }
                    HttpSession se=request.getSession();
                    //String s1=rs1.getString("sno");
                    String s1=request.getParameter("bk1");
                    se.setAttribute("sn", s1);
                    System.out.println(s1+">>>>>>>>>>");
                    
                     
      out.write("\n");
      out.write("                </tbody></table>\n");
      out.write("                \n");
      out.write("                <button class=\"button\" type=\"submit\" name=\"Book Search\" style=\"vertical-align:middle\" onclick=\"form.action='RenBk';\"><span>Book Renewal </span></button>\n");
      out.write("                  \n");
      out.write("\t\t\t\t\n");
      out.write("                      </div>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("\t\t  \t\t\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("                \n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery-throttle-debounce/1.1/jquery.ba-throttle-debounce.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.stickyheader.js\"></script>\n");
      out.write("            </form>    \n");
      out.write("                <a href=\"StdAct.jsp\" class=\"button\" style=\"vertical-align:middle\">Exist</a>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
