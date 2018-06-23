<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    footer {
      background-color:black;
      padding: 20px;
      color:yellow;
    }
    
    body { 
background-image: url("ui1.jpg");
 -webkit-background-size: cover;
 -moz-background-size: cover;
 -o-background-size: cover;
 background-size: cover;
   
 height:100%;
 width:100%;
}
.footer{
	position:fixed;
	width:100%;
	bottom:0;
	left:0;
	background-color:black;
	color:yellow;
	text-allign:center;
}
#myDIV {
    width: 70%;
    padding: 100px 0;
    text-align: center;
    background-color:;
    margin-top: 20px;
}
.container {
  width: 500px;
  clear: both;
}
.loginBox input[type="submit"]
{
	border:none;
	outline:none;
	height:40px;
	color:#fff;
	font-size:16px;
	background:#ff267e;
	cursor:pointer;
	border-radius:20px;
	
}
.loginBox input[type="submit"]:hover
{
	background:#efed40;
	color:#262626;
}

</style>
<title>Student Panel</title>
</head>
<body>
<h2><a href="kInstituteProfile">My Profile</a></h2>
<h2><a href="KStudentSelectingInstitute.html">Join Courses</a></h2>
<h2><a href="LogOutServlet">Logout</a></h2>
<basefont size=5>
	<CENTER>
		<h1>
			<font color="white">Students under my Institution:</font>
		</h1>
	</CENTER>
	<center>
<div id="myDIV">
<center>
<table border=1 align = "center"  style = "width :100%">
		<tr bgcolor = "green">
			
			<th width = "10%">Student Name</th>
			<th width = "10%">User Name</th>
			<th width = "10%">Student Email</th>
			<th width = "10%">Contact</th>
			<th width = "10%">Location</th>
			<th width = "10%">Course</th>
			<th width = "10%">Delete</th>
		</tr>
		<c:forEach items="${scList}" var="sc">
			<tr bgcolor = "ash" align = "center">
				<td style = "color:white;">${sc.sname }</td>
				<td style = "color:white;">${sc.username }</td>
				<td style = "color:white;">${sc.email }</td>
				<td style = "color:white;">${sc.contact}</td>
				<td style = "color:white;">${sc.location}</td>
				<td style = "color:white;">${sc.cname}</td>
				<td style = "color:white;"><a href ="StudentDeletionServlet?studId=${sc.studId}&amp;cId=${sc.cid}">DELETE</a></td>
				
				
			</tr>
		</c:forEach>
	</table></center>
</div>
</center>
<div class="footer">
<center>
 <p>@copyright PROJECT5</p>
  </center>
</div>
	
</body>
</html>