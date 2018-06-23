<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background:url(ui9.jpg);
background-size:cover;
}
.sign_up{
border-radius:5px;
background:purple;
padding:20px;
width : 420px;
margin:auto;
color:#fff;
font-size:16px;
font-family:Verdana;
margin-top:100px;
opacity:0.6;
}
.sign_up h1{
text-align:center;
margin:0;
padding:0;
}
.sign_up input,select{
padding:10px 20px;
margin:7px 0;
display:inline-block;
border:1px solid #ccc;
border-radius:4px;
box-sizing:border-box;
font-size:18px;
background:black;
color:white;
opacity:0.9;
}
.sign_up input[type = submit]{
width:100%;
border:none;
cursor:pointer;
}
#stuId{
width:30%;
}
#sname{
width:0%;
}
#email{
width:100%;
}
#contact{
width:49.5%;
}
#location{
width:49%;
}
input[type=submit]:hover{
background:#45a049;
transition:0.6s;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UPDATE</title>
</head>
<body>

<div class = "sign_up">
<form>
<h1>Update Details</h1>
<hr>
<input type="text" name="stuId" value=${sdetails.stuId} readOnly=true><br>
<input type="text" name="sname" value=${sdetails.sname}><br/>
<input type="text" name="email" value=${sdetails.email}><br/>
<input type="text" name="contact" value=${sdetails.contact}><br/>
<input type="text" name="location" value=${sdetails.location}><br/>
<a href="kstudentpanel.jsp">update</a>
<input type="submit" class = "button" value="UPDATE">

</form>
</div>


</body>
</html>