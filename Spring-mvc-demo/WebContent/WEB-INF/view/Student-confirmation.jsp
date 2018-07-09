<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation Form </title>
</head>
<body>

The confirmation is done for student: ${student.Firstname} ${student.Lastname}
<br><br>

From the country:${student.country}
<br><br>

//radio buttons
 Favourite Language : ${student.favouriteLanguage }
 
 <br><br>
 //check box
 Operating System:
 <ul>
 //declaring temp as variable
 <c:forEach var = "temp" items ="${student.operatingSystem}">
 
 <li> ${temp} </li>
 </c:forEach>
 </ul>
 

</body>
</html>