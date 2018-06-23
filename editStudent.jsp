<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit Student</title>
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
</head>
<body background = "img5.PNG">
<center><font size = "+5"><h1>DETAILS</h1></font>
<h1>Student id : <input type="text" name="stuId" value=${sdetails.stuId} readOnly=true></h1>
<h1>Student name : <input type="text" name="sname" value=${sdetails.sname}></h1>
<h1>User name : <input type="text" name="uname" value=${sdetails.userName}></h1>
<h1>Password : <input type="text" name="password" value=${sdetails.password}></h1>
<h1>email : <input type="text" name="email" value=${sdetails.email}></h1>
<h1>contact : <input type="text" name="contact" value=${sdetails.contact}></h1>
<a href="StudentPanel.jsp"><h1>Back</h1></a>
</center>

</body>
</html>