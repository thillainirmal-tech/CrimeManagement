<%-- 
    Document   : newuser
    Created on : Jan 25, 2019, 1:11:25 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <!-- Icons font CSS-->
    

    <!-- Main CSS-->
    <link href="css/newmain.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Criminal Acquest Info</h2>
                    <form action="FirUpl.jsp" method="POST">
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Crimer Name" required="enter fields" name="uname">
                        </div>
                        
                        <div class="input-group">
                            <input class="input--style-3" type="number" required="enter fields" placeholder="Crimer Age" name="cage">
                        </div>
                        <div class="input-group">
                            <input class="input--style-3" type="text" required="enter fields" placeholder="Crimer Area" name="cadd">
                        </div>
                         <div class="input-group">
                            <input class="input--style-3" type="date" placeholder="Crime Date" required="enter fields" name="cdate">
                        </div>
                        
                        <div class="input-group">
                            <input class="input--style-3" type="text" required="enter fields" placeholder="Types of crime" name="crime">
                        </div>
                        
                        
                        
                        
                        
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Next FIR Upload</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    
    <!-- Main JS-->
    <script src="js/newglobal.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
