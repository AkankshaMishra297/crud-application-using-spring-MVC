<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form:form action="submitForm" modelAttribute="reservation">  
        First name: <form:input path="Name" />         
        <br><br>  
        Password: <form:input path="Pass" />  
        <br><br>  
        <input type="submit" value="Submit" />       
    </form:form> 

</body>
</html>