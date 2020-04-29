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
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
<style>
button {
  background-color: #F6BC05;
  border-radius: 12px;
  color: black;
  font-size: 15px;
  padding: 14px 20px;
  margin: 8px 0;
  border: 5px solid #F9A704;
  cursor: pointer;
  width: 10%;
}

button:hover {
  opacity: 0.8;
 
}
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
background-image: url("homePageBGBlur2.jpg");
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
div#frm *{display:inline}
#table{
 width : 80%;
 padding:10px;
 border: 15px solid #F6BC05;
 font-family: arial, sans-serif;
 border-radius:98px;
}
th td{
border-bottom: 1px solid;
padding: 10px;
border-radius: 90px;
background-color: #FFE87C;
align : center;
}

tr {
background-color: #FFE87C;
border-radius: 90px;
padding: 10px;
}
a{
 text-align:center;
 font-family: arial, sans-serif;
 background-color:#F5F9FB ;
 color: #3C5B6F;
 }

</style>
<title>Institute Panel</title>
</head>
<body>
<br><br><br><br>
<div id="frm"> &emsp;&emsp;&emsp;&emsp; &emsp;&emsp; &emsp;&emsp; &emsp;&emsp;<form action="InstituteProfileservlet" method = "post">
    <button class="button">View Profile</button>
    </form>  &emsp; &emsp;&emsp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp; &emsp;
    <form action = "InstituteAddNewCourseServlet">
    <button class="button">Offer Course</button>
    </form>&emsp; &emsp;&emsp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp; &emsp; &emsp;
    <form action = "khome.html">
    <button class="button">Log out<i class='fas fa-power-off'></i></button>
    </form>
   
</div>
<br><br><br>
<basefont size=5>
<CENTER>
<h1>
<font color="white">Registered Students:</font>
</h1>
</CENTER>
<center>
<div id="table">
<center>
<table border=1>
<tr align = "center">

<th width = "15%" style = "color:black;">Student Name</th>
<th width = "15%" style = "color:black;">User Name</th>
<th width = "20%" style = "color:black;">Student Email</th>
<th width = "15%" style = "color:black;" >Contact</th>
<th width = "20%" style = "color:black;">Location</th>
<th width = "10%" style = "color:black;">Course</th>
<th width = "10%" style = "color:black;">Delete</th>
</tr>
<c:forEach items="${scList}" var="sc">
<tr>
<td style = "color:black;">${sc.sname }</td>
<td style = "color:black;">${sc.username }</td>
<td style = "color:black;">${sc.email }</td>
<td style = "color:black;">${sc.contact}</td>
<td style = "color:black;">${sc.location}</td>
<td style = "color:black;">${sc.cname}</td>
<td style = "color:black;"><a href ="StudentDeletionServlet?studId=${sc.studId}&amp;cId=${sc.cid}">DELETE</a></td>

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
