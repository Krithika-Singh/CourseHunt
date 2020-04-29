<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
th td{
border-bottom: 1px solid;
border-radius: 90px;
background-color: #D7DBDE;
text-align:center;
}

tr {
background-color: #D7DBDE;
border-radius: 90px;
text-align:center;
}

h1{
  font-size: 60px;
  color:#FFE87C;
  text-transform: uppercase;
  font-weight: 250;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:98%;
  height:98%;
  table-layout: fixed;
}

.tableContainer {
width : 480px;
height:500px;
 padding:20px;
 border: 15px solid #F6BC05;
 font-family: arial, sans-serif;
 border-radius:98px;
 margin-left:400px;
}




/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);
body{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  background:url("homePageBGBlur2.jpg");
  font-family: 'Roboto', sans-serif;
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
 margin-bottom:0px
 }
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<title>Insert title here</title>
</head>
<body>
<br><br>
<h1><italic>Student Profile</italic></h1><br><br><br>
	<section>
		<div class="tableContainer">
			<table>
				<tbody>

					<tr><th>Student Id</th><td>${stud.stuId }</td></tr>
					<tr><th>Student Name</th><td>${stud.sname }</td></tr>
					<tr><th>User Name</th><td>${stud.userName }</td></tr>
					<th>Email</th><td>${stud.email }</td></tr>
					<tr><th>Contact</th><td>${stud.contact}</td></tr>
					<tr><th>Location</th><td>${stud.location}</td></tr>
					<tr><th>Edit</th><td><a href="StudentEditServlet?stud_id=${stud.stuId}">Edit</a></td></tr>
				</tbody>
			</table>
		</div>
	</section>
	<a id="back" href = "kstudentpanel.jsp"><i class='fas fa-home'></i></a>
</body>
</html>