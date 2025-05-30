<%-- 
    Document   : fir
    Created on : 26 Feb, 2020, 4:34:05 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />


<style type="text/css">
<!--
.style1 {
	font-size: 18px;
	font-weight: bold;
}
-->
</style>


</head>
<body>
<div id="header">
	<div id="logo">
            <center>
		<h1>MISSING PEOPLE</h1>
		<h2>Registry </h2>
                </center>
	</div>
</div>
<div id="content">

  <div id="colOne">
    <p>&nbsp;</p>
    <div>
<form id="form1" name="form1" method="post" action="missing">
<table width="427" border="0" align="center">
  
  <tr>
    <td class="style4"><div align="right"><strong><span class="style4">NAME</span></strong></div></td>
    <td>
      <label>
        <input type="text" name="name" id="dis" />
        </label>       </td>
  </tr>
  <tr>
    <td class="style4"><div align="right"><strong><span class="style4">MOBILE NO</span><span class="style5">:</span></strong></div></td>
    <td><input type="text" name="mobile" id="da" /></td>
  </tr>
  <tr>
    <td class="style4"><div align="right"><strong><span class="style5">ADDRESS</span></strong></div></td>
    <td><input type="text" name="addd" id="ti" /></td>
  </tr>
  <tr>
    <td class="style4"><div align="right"><strong><span class="style5">PIN CODE</span></strong></div></td>
    <td><input type="text" name="pin" id="toi" /></td>
  </tr>
  <tr>
    <td class="style4"><div align="right"><strong><span class="style5">DATE</span></strong></div></td>
    <td><input type="date" name="da" id="place" /></td>
  </tr>
  
  
                                    
  <tr>
    <td colspan="2"><div align="center">
      <input type="submit" name="button" id="button" value="Submit" onclick="return doValue()" />
    </div></td>
    </tr>
</table>

</form>
    </div>
  </div>
</div>
    

	

</body>
</html>






