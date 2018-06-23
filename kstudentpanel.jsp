<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Comments</title>
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
.leftcolumn {   
    float: left;
    width: 75%;
}
.rightcolumn {
    float: right;
    width: 25%;
}
.container {
  width: 500px;
  clear: both;
}
</style>

</head>
<body>
<nav class="navbar navbar-inverse ">
	
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">CourseHunt</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-center">
        <li><a href="StudentProfileServlet">   My Profile  </a></li>
        <li><a href="KStudentSelectingInstitute.html">  Join Courses  </a></li>
        <li><a href="LogOutServlet">     Logout    </a></li>
      </ul>
      
    </div>
  </div>
</nav>
<div class ="leftcolumn">
<basefont size=5>
	<CENTER>
		<h1>
			<font color="white">Institutions I have registered in:</font>
		</h1>
	</CENTER>
<center>
<div id="myDIV">
<table border=1>
		<tr>
			<th>IId</th>
			<th width = "10%">InstitutionName</th>
			<th width = "10%">email</th>
			<th width = "10%">contact</th>
			<th width = "10%">location</th>
			<th width = "10%">CourseName</th>
		
			
			
	
	</tr>
	
	<c:forEach  items="${InstList}" var="Inst">
        <tr>
				<td style = "color:white;">${Inst.instid}</td>
				<td style = "color:white;">${Inst.instname}</td>
				<td style = "color:white;">${Inst.email}</td>
				<td style = "color:white;">${Inst.contact}</td>
				<td style = "color:white;">${Inst.location}</td>
				<td style = "color:white;">${Inst.cname}</td>				
		    </tr>
		    </c:forEach>


		
	</table><br>
</div>
</center>
</div>
<div class="rightcolumn">
<div class="container">
<h1><font color="white">Rate institutes:</font></h1>
<form action="RatingServlet" method="post">
<p><label for="iid">Institute Id:</label><input type="text" name="iid" value="ID"></p>
<p><label for="rate">Rating   :</label>
              <select name="rate" id="rate">
               <option value = "1">1</option>
               <option value = "2">2</option>
               <option value = "3">3</option>
               <option value = "4">4</option>
               <option value = "5">5</option>
             </select></p>
<p><label for="comment">Comment:</label><textarea name = "comment"  rows = "3" cols = "22"></textarea></p>
<input type="submit" value="submit">
</form>
</div>
</div>
	
	<div class="footer">
<center>
 <p>@copyright PROJECT5</p>
  </center>
</div>
</body>
</html>