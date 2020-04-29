<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.ts.dto.Institution" import="com.ts.dto.inst_course"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Institution offering the courses</title>
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

#table{
 width : 80%;
 padding:20px;
 border: 15px solid #F6BC05;
 font-family: arial, sans-serif;
 border-radius:98px;
 margin-left:100px;
}
th td{
border-bottom: 1px solid;
padding: 10px;
border-radius: 90px;
align : center;
}

tr {
border-radius: 90px;
padding: 10px;
}
#back{
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

<center><font size = "+2" color = "silver"><h1>INSTITUTIONS OFFERING THE COURSE</h1></font></center>&emsp; &emsp; &emsp; &emsp; &emsp;
<center><form action = "Googlemaps.html">
    <button class="button">Search Location</button>
    </form></center><br>
<div id="table">
<table border=1 align = "center">
       
		<tr bgcolor = "#e4decd">
			
			<th width = "10%">Institute Name</th>
			<th width = "10%">Email</th>
			<th width = "10%">Contact</th>
			<th width = "10%">Location</th>
			<th width = "10%">Timings</th>
			<th width = "10%">Vacancy</th>
			<th width = "10%">Duration</th>
			<th width = "10%">Fee</th>
			<th width = "10%">Registration</th>
	</tr>
	
	<c:forEach  items="${InstList}" var="Inst">
        <tr bgcolor = "#e4decd" align = "center">
				
				<td style = "color:black;">${Inst.iname}</td>
				<td style = "color:black;">${Inst.email}</td>
				<td style = "color:black;">${Inst.contact}</td>
				<td style = "color:black;">${Inst.location}</td>
				<td style = "color:black;">${Inst.timing}</td>
				<td style = "color:black;">${Inst.vacancy}</td>
				<td style = "color:black;">${Inst.cduration}</td>
				<td style = "color:black;">${Inst.fees}</td>
				<td><a href="GetRegisteredIntoInstitute?id=${Inst.instId}">REGISTER</a></td>
				
		    </tr>
		    </c:forEach>

</table>
      
       
</div>
<a id="back" href="kstudentpanel.jsp">BACK</a>
</body>
</html>