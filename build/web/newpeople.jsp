<%-- 
    Document   : newpeople
    Created on : 26 Feb, 2020, 4:24:00 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
</style>
</head>
<body>

<ul>
    <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="fir.jsp">FIR</a></li>
  <li><a href="mp.jsp">Missing People</a></li>
  <li><a href="safty.jsp">Tips</a></li>
</ul>

    </body>
</html>
