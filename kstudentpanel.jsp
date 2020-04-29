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
    
    div#frm *{display:inline}
    
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

#table{
 width : 70%;
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
  width: 10px;
  height: 10px;
  padding:8px;
  border-radius:95px;
  border: 20px solid #D7DBDE;
 text-align:center;
 font-family: arial, sans-serif;
 background-color:#F5F9FB ;
 color: #3C5B6F;
 margin-left:620px;
 margin-bottom:0px;
 }

</style>

</head>
<body>
<br><br><br><br>
<div id="frm">
&ensp;&emsp;&emsp;&emsp;&ensp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&ensp;&emsp;&emsp;&ensp;&emsp;
    <form action="StudentProfileServlet" method = "post">
    <button class="button">View Profile</button>
    </form> &ensp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&ensp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&ensp;&emsp; 
    <form action="KStudentSelectingInstitute.html">
    <button class="button">Join Course</button>
    </form> &ensp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&ensp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&ensp;&emsp; &emsp;
    <form action = "khome.html">
    <button class="button">Log out<i class='fas fa-power-off'></i></button>
    </form>
    
</div>
<br><br><br>
<basefont size=8>
	<CENTER>
		<h1>
			<font color="white">Registered Institutes:</font>
		</h1>
	</CENTER>
<center>
<div id="table">
<table align = "center">
		<tr align="center">
			<th align="center" width = "10%" style = "color:black;">InstitutionId</th>
			<th align="center" width = "20%" style = "color:black;">InstitutionName</th>
			<th align="center" width = "20%" style = "color:black;">Email</th>
			<th align="center" width = "10%" style = "color:black;">Contact</th>
			<th align="center" width = "20%" style = "color:black;">Location</th>
			<th align="center" width = "10%" style = "color:black;">Course Name</th>
	</tr>
	
	<c:forEach  items="${InstList}" var="Inst">
        <tr bgcolor="lightgray">
				<td width = "10%" style = "color:black;">${Inst.instid}</td>
				<td width = "20%" style = "color:black;">${Inst.instname}</td>
				<td width = "20%" style = "color:black;">${Inst.email}</td>
				<td width = "10%" style = "color:black;">${Inst.contact}</td>
				<td width = "10%" style = "color:black;">${Inst.location}</td>
				<td width = "10%" style = "color:black;">${Inst.cname}</td>				
		    </tr>
		    </c:forEach>


		
	</table><br>
</div>
</center>
	
	<div class="footer">
<center>
 <p>@copyright PROJECT5</p>
  </center>
</div>
</body>
</html>