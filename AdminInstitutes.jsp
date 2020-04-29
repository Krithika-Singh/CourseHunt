<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.ts.dto.Institution" import="com.ts.dto.Courses"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<title>Institution offering the courses</title>
<style>
#table{
 width : 100%;
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
<body background = "homePageBGBlur2.jpg">

<center><font size = "+3" color = "white"><h1>Registered Institutes</h1></font></center><br>
<div id="table">
<table border=1 align = "center">
       
		<tr bgcolor = "#e4decd">
			
			<th width = "10%">Institution Name</th>
			<th width = "15%">Email</th>
			<th width = "8%">Contact</th>
			<th width = "12%">Location</th>
			<th width = "5%">Timings</th>
			<th width = "5%">Vacancy</th>
	</tr>
	
	<c:forEach  items="${Inst}" var="Inst">
        <tr bgcolor = "#e4decd" align = "center">
				
				<td style = "color:black;">${Inst.iname}</td>
				<td style = "color:black;">${Inst.email}</td>
				<td style = "color:black;">${Inst.contact}</td>
				<td style = "color:black;">${Inst.location}</td>
				<td style = "color:black;">${Inst.timing}</td>
				<td style = "color:black;">${Inst.vacancy}</td>
				
		    </tr>
		    </c:forEach>

</table>
</div>
<a href="AdminHomePage.html"><i class='fas fa-home'></i></a>
</body>
</html>