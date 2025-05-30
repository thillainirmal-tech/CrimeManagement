<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Crime information</title>
		<meta name="description" content="Sticky Table Headers Revisited: Creating functional and flexible sticky table headers" />
		<meta name="keywords" content="Sticky Table Headers Revisited" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<!--[if IE]>
  		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
	</head>
        <style>
  .button {
  display: inline-block;
  border-radius: 4px;
  background-color: #000000;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 20px;
  padding: 5px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>


	<body align="center">
            <form name="formm" action="DetWdDate.jsp" method="POST" onsubmit="return one()">
		<div class="container">
			<!-- Top Navigation -->
			
			<header>
                            <h1>All areas crime details</h1>	
                         </header>
                       
    <nav class="codrops-demos">
        <a>Enter Crime Date:  <input type="date" name="stdrg" value=""/></a>&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
<!--      <a>Book Name  :  <input type="text" name="bknm" value=""/></a>&nbsp;&nbsp;&nbsp;&nbsp;<br><br>-->
        <button class="button" type="submit" name="Student Status" style="vertical-align:middle"><span>Crime </span></button>
<!--        <button class="button" type="submit" name="Book Search" style="vertical-align:middle" onclick="form.action='SerBk.jsp';"><span>Book Search </span></button>-->
        
    </nav>
			
			<div class="component">
				
				<table>
					<thead>
						<tr>
							
                                                    <th>S.No</th>
                                                    <th>Crimmer Name</th>
							<th>Crime Date</th>
                                                        <th>Crime Area</th>
							<th>Crime Name</th>
							
							
						</tr>
					</thead>
					<tbody>
                    <%
                        try{
                    String d1=request.getParameter("stdrg");
                
                    String query="SELECT * FROM crecd WHERE cdate='"+d1+"' ";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery(query);
                    while(rs1.next())
                     
                    
                                                 {
                    %>
                    <tr>
                        
                        
                        <td><%=rs1.getString("firno") %></td>
                        <td><%=rs1.getString("cname") %></td>
                        <td><%=rs1.getString("cadd") %></td>
                        <td><%=rs1.getString("cdate") %></td>
                        <td><%=rs1.getString("crime") %></td>
                        
                        
                    </tr>
                    <%
                    
                    }
                    
                     
                        }catch(Exception e){
                        
                        System.out.println(e);
                        }
                    HttpSession se=request.getSession();
                    //String s1=rs1.getString("sno");
                    String s1=request.getParameter("bk1");
                    se.setAttribute("sn", s1);
                    System.out.println(s1+">>>>>>>>>>");
                    
                     %>
                </tbody></table>
                
                  
				
                      </div>
            
                 
		  		
		</div><!-- /container -->
                
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-throttle-debounce/1.1/jquery.ba-throttle-debounce.min.js"></script>
		<script src="js/jquery.stickyheader.js"></script>
            </form>    
                <a href="crimepage.jsp" class="button" style="vertical-align:middle">Exist</a>
	</body>
</html>