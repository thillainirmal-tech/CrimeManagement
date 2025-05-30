<%-- 
    Document   : aqudeta
    Created on : 15 Feb, 2019, 3:22:48 PM
    Author     : Prabu
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    
    HttpSession se=request.getSession();
    
    
    %>
    <body background="images/img13.jpg"><center>
        <h1>Aquest Details!!!</h1>
        <form action="AquCheck" method="post">
        
            <h3>  <table style="color: #fff;height: 40px;width: 1000px; text-indent: 20px" border="1">
					<thead>
						<tr>
							
							<th>Verify</th>
                                                        <th>Aquest Name</th>
							<th>Aquest Age</th>
							<th>Aquest Address</th>
							<th>Fir File Name</th>
							
						</tr>
					</thead>
					<tbody>
                    <%
                  try{
                    String query="SELECT * FROM crecd where status='Pending' ";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery(query);
                    while(rs1.next())
                    
                    
                                                 {
                    %>
                    <tr>
                        
                        <td><input type="radio" name="firno" required="Plz Select any one field" value="<%=rs1.getString("firno") %>"></td>
                        <td><%=rs1.getString("cname") %></td>
                        <td><%=rs1.getString("cage") %></td>
                        <td><%=rs1.getString("cadd") %></td>
                        <td><%=rs1.getString("filename") %></td>
                        
                    </tr>
                    <%
                    
                     String c=rs1.getString("firno");
                           se.setAttribute("a", c);
                                       }
                  }catch(Exception e){
                  
                  System.out.println(e);
                  }
                     %>
                </tbody>
                </table></h3>
                <br><br>
                <input type="submit" value="Approved" style="background: #000;color: #fff;height: 40px;width: 80px"/>
        
        </form>
                
                
        </center>
                <a href="index.jsp" style="box-shadow: #23527c;color: #fff"> Exist</a>          
    </body>
</html>
