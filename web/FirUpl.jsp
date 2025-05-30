<%-- 
    Document   : FirUpl
    Created on : 1 Feb, 2019, 4:59:51 PM
    Author     : Prabu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="description" content="Demo for the tutorial: Styling and Customizing File Inputs the Smart Way" />
		<meta name="keywords" content="cutom file input, styling, label, cross-browser, accessible, input type file" />
		<meta name="author" content="Osvaldas Valutis for Codrops" />
		<link rel="shortcut icon" href="favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize_2.css" />
		<link rel="stylesheet" type="text/css" href="css/demo_2.css" />
		<link rel="stylesheet" type="text/css" href="css/component_1.css" />
    </head>
    
     <script>(function(e,t,n){var r=e.querySelectorAll("html")[0];r.className=r.className.replace(/(^|\s)no-js(\s|$)/,"$1js$2")})(document,window,0);</script>
                <style>
.button {
  padding: 15px 25px;
  font-size: 15px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #000000;
  background-color: #F5B7B1;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #F5B7B1}

.button:active {
  background-color: #F5B7B1;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
        </head>
        <script>
            function valid()
            {
                var a1=document.form1.file1.value;
                
                if(a1=="")
                    {
                        alert("Choose file");
                        return false;
                    }
                    return true;
            }
        </script>
        
        <%
        HttpSession se=request.getSession();
        
        String s1=request.getParameter("uname");
        String s2=request.getParameter("cage");
        String s3=request.getParameter("cadd");
        String s4=request.getParameter("cdate");
        String s5=request.getParameter("crime");
        

        String c4=request.getParameter("c4");
        System.out.println(s1+"....."+s2+"//////"+s3);
          
        
        se.setAttribute("uname", s1);
        se.setAttribute("cage", s2);
        se.setAttribute("cadd", s3);
        se.setAttribute("cdate", s4);
        se.setAttribute("crime", s5);
        
        %>
        
        
    <body>
         <form action="FirUpload" method="post" name="form1" id="form1" enctype="multipart/form-data" onsubmit="return valid()">
		<div class="container">
			<header class="codrops-header">
                            <h1><font size="8" face="Californian FB"> Upload Page</font></h1>
			 	
			</header>
			<div class="content">
                           

				<div class="box">
					<input type="file" name="file1" id="file-5" class="inputfile inputfile-4" data-multiple-caption="{count} files selected" multiple />
                                        <button name="Submit" class="button">Upload</button>
                             
                                 </div>
                         
			</div>
		</div><!-- /container -->

		<script src="js/custom-file-input.js"></script>

		<!-- // If you'd like to use jQuery, check out js/jquery.custom-file-input.js
		<script src="js/jquery-v1.min.js"></script>
		<script src="js/jquery.custom-file-input.js"></script>
		-->
                </form>
    </body>
</html>
