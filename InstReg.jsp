<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  padding: 1px;
  text-align: center;
  font-family: 'Saira Stencil One';
  font-size: 70px;
  color: white;
}

/* Container for flexboxes */

img {
  border-radius: 50%;
}

p.indent {
  padding-right: 5.5em 
 }
 
.buttonContainer {
  width: 400px;
  height: 400px;
  padding: 20px;
  border: 20px solid #ccc;
  border-radius: 50%;
 text-align:center;
 margin-top:180px;
}
button {
  background-color: #F6BC05;
  border-radius: 12px;
  color: black;
  font-size: 15px;
  padding: 14px 20px;
  margin: 8px 0;
  border: 5px solid #F9A704;
  cursor: pointer;
  width: 20%;
}

button:hover {
  opacity: 0.8;
  
}

</style>
</head>
<body background = "homePageBGBlur2.jpg">
	
	<font size = "+3" color= "white"><center><h1> COURSES VIEW </h1></center></font>
	    <form action="InstitutionCourse" method="post">
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1001">C</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1002">C++</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1003">Java</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1004">CAT</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1005">GATE</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1006">Python</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1007">Advance java</h1></font>
		<font color = "white"><h1><input type = "checkbox" name = "course" value = "1008">Web Designing</h1></font>
		
		<!--input type = "submit" name="s" value="SUBMIT"--><br>
		<button class="button">SUBMIT</button>
		</form>

</body>
</html>