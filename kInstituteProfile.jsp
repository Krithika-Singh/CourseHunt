<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

h1{
  font-size: 50px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 250;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
  table-layout: fixed;
}
.tbl-header{
  background-color: rgba(255,255,255,0.5);
 }
.tbl-content{
  height:1px;
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(255,255,255,0.3);
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 15px;
  color: #fff;
  text-transform: uppercase;
}
td{
  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 15px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}


/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);
body{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  background:url(up3.jpg);
  font-family: 'Roboto', sans-serif;
}
section{
  margin: 50px;
}


/* follow me template */
.made-with-love {
  margin-top: 10px;
  padding: 10px;
  clear: left;
  text-align: center;
  font-size: 10px;
  font-family: arial;
  color: #fff;
}
.made-with-love i {
  font-style: normal;
  color: #F50057;
  font-size: 14px;
  position: relative;
  top: 2px;
}
.made-with-love a {
  color: #fff;
  text-decoration: none;
}
.made-with-love a:hover {
  text-decoration: underline;
}


/* for custom scrollbar for webkit browser*/

::-webkit-scrollbar {
    width: 6px;
} 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
} 
::-webkit-scrollbar-thumb {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br><br>
<h1><italic>Institution Profile</italic></h1><br><br><br>
<table border=1>
<section>
		<div class="tbl-header">
		<table cellpadding="0" cellspacing="0" border="0">
		<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>User Name</th>
			<th>password</th>
			<th>email</th>
			<th>contact</th>
			<th>location</th>
			<th>timing</th>
			<th>vacancy</th>
			<th>Edit</th>
		</tr>
		</thead>
		<table>
		</div>
		<div class="tbl-content">
		<table cellpadding="0" cellspacing="0" border="0">
		<tbody>
	
		<tr>
				<td>${inst.instId }</td>
				<td>${inst.iname }</td>
				<td>${inst.userName }</td>
				<td>${inst.password }</td>
				<td>${inst.email }</td>
				<td>${inst.contact}</td>
				<td>${inst.location}</td>
				<td>${inst.timing}</td>
				<td>${inst.vacancy}</td>			
				<td><a href="InstEditServlet?Inst_id=${inst.instId}">Edit</a></td>
				
		</tr></tbody>
		
	</table>
	</div>
	</section>

</body>
</html>
