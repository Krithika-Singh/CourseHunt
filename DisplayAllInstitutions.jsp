<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.ts.dto.Institution" import="com.ts.dto.Courses"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Institution offering the courses</title>
</head>
<body background = "book1.jpg">

<center><font size = "+2" color = "silver"><h1>INSTITUTIONS OFFERING THE COURSE</h1></font></center><br>
<a href="StudentPanel.jsp">BACK</a>
<div id="table">
<table border=1 align = "center"  style = "width :100%">
       
		<tr bgcolor = "mediumseagreen">
			
			<th width = "10%">InstName</th>
			<th width = "10%">email</th>
			<th width = "10%">contact</th>
			<th width = "10%">location</th>
			<th width = "10%">timings</th>
			<th width = "10%">vacancy</th>
			<th width = "10%">Registration</th>
			
	
	</tr>
	
	<c:forEach  items="${InstList}" var="Inst">
        <tr bgcolor = "ash" align = "center">
				
				<td style = "color:white;">${Inst.iname}</td>
				<td style = "color:white;">${Inst.email}</td>
				<td style = "color:white;">${Inst.contact}</td>
				<td style = "color:white;">${Inst.location}</td>
				<td style = "color:white;">${Inst.timing}</td>
				<td style = "color:white;">${Inst.vacancy}</td>
				<td><a href="GetRegisteredIntoInstitute?id=${Inst.instId}">REGISTER</a></td>
				
		    </tr>
		    </c:forEach>

</table>
      
       
</div>

</body>
</html>