<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background:url(homePageBGBlur2.jpg);
background-size:cover;
}
.sign_up{
border-radius:5px;
background:white;
padding:10px;
width : 420px;
margin:auto;
color:black;
font-size:16px;
font-family:Verdana;
margin-top:100px;
opacity:0.6;
}
.sign_up h1{
text-align:center;
margin:0;
padding:0;
}
.sign_up input,select{
padding:10px 20px;
margin:7px 0;
display:inline-block;
border:1px solid #ccc;
border-radius:4px;
box-sizing:border-box;
font-size:18px;
background:black;
color:white;
opacity:0.9;
}
.sign_up input[type = submit]{
width:100%;
border:none;
cursor:pointer;
}
#stuId{
width:30%;
}
#sname{
width:0%;
}
#email{
width:100%;
}
#contact{
width:49.5%;
}
#location{
width:49%;
}
input[type=submit]:hover{
background:#45a049;
transition:0.6s;
}

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
<title>Institute Update Servlet</title>
</head>
<body>
<div class = "sign_up">
<form action="InstUpdateServlet" method="post" align = center>
<h1>Update Details</h1>
<hr>
<input type="text" name="instId" value=${instDetails.instId} readOnly=true>
<input type="text" name="iname" value=${instDetails.iname}>
<input type="text" name="email" value=${instDetails.email}>
<input type="text" name="contact" value=${instDetails.contact}>
<input type="text" name="location" value=${instDetails.location}>
<input type="text" name="timing" value=${instDetails.timing}>
<input type="text" name="vacancy" value=${instDetails.vacancy}>
<input type="submit" class = "button" value="UPDATE">
</form>
</div>
</body>
</html>