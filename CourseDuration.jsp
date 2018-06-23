<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.ts.dto.Courses"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CourseDuration</title>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background:url();
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

<% Courses cc = (Courses)request.getAttribute("course");
   System.out.println(cc);
   String cd= cc.getCourseDuration();
   int fee=cc.getFee();
   System.out.println(cd);
   System.out.println(fee);
   
%>
</head>
<body><div class = "sign_up">
<form>
<h1>Update Details</h1>
<hr> </form>
        </div>
</center>

      <h3> Course Duration : <%= cd %></h3>
        <h3>Fee : <%= fee %></h3><br/>
</body>
</html>