<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration form </title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

// to load the data into the form spring MVC uses getter methods on student object 

First name:<form:input path="Firstname" />

//validators
Last name (*): <form:input path = "LastNnme" />
Last name:<form:input path="Lastname"  cssClass = "error" />

Country:

<form:select path="country">

<form:options items = "${student.countryOptions}"/>

//<form:option value="China">China</form:option>


//<form:option value="USA">USA</form:option>


//<form:option value="Malaysia">Malaysia</form:option>


</form:select>

<br><br>

Favourite Language:
Java <form:radiobutton path = "favouriteLanguage" value = "Java" />
Java <form:radiobutton path = "favouriteLanguage" value = "Php"/>
Java <form:radiobutton path = "favouriteLanguage" value = "C#"/>
Java <form:radiobutton path = "favouriteLanguage" value = "c++"/>

<br><br>
operating System:
Linux <form:checkbox path = "operatingSystem" value = "Linux" />
Mac<form:checkbox path = "operatingSystem" value = "Mac" />
Windows<form:checkbox path = "operatingSystem" value = "windows" />
<input type="submit" value="Submit"/>




// when submitting the form spring MVC uses setter methods on object to send data to DB

</form:form>

</body>
</html>