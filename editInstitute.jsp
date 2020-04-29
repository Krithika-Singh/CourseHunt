<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.button{
background-color:#4CAF50;
color:white;
padding:15px 32px;
text-align:center;
display:inline-block;
font-size:20px;
margin:4px 1px;
cursor:pointer;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Institute Update</title>
</head>
<body background = "jsp_img2.jpg">"
<center>
<font size = "+3"><h1>DETAILS</h1></font>
<form action="InstUpdateServlet" method="post" align = center>
<h2>Institute id         : <input type="text" name="instId" value=${instDetails.instId} readOnly=true></h2>
<h2>Institute name       : <input type="text" name="iname" value=${instDetails.iname}><h2>
<h2>Enter email          : <input type="text" name="email" value=${instDetails.email}></h2>
<h2>Enter contact        : <input type="text" name="contact" value=${instDetails.contact}></h2>
<h2>Enter location       : <input type="text" name="location" value=${instDetails.location}></h2>
<h2>Enter timing         : <input type="text" name="timing" value=${instDetails.timing}></h2>
<h2>Enter vacancy        : <input type="text" name="vacancy" value=${instDetails.vacancy}></h2>
<input type="submit" class = "button" value="UPDATE">
</form>
</center>
</body>
</html>