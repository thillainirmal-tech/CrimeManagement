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
    <title>Crime</title>

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
                    <h2 class="title">Login Info</h2>
                    <form action="JaiLog" method="POST">
                        
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Username" required="enter fields" name="user">
                        </div><br><br>
                        <div class="input-group">
                            <input class="input--style-3" type="password" placeholder="Password" required="enter fields" name="pswd">
                        </div><br><br>
                        
                        
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Submit</button>
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
