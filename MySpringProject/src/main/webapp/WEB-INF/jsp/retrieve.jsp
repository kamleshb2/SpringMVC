<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
      <%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find TV</title>
</head>
<body>

<form action="retrieve" method="POST" >
  <div class="container">
    <h1>Please Enter the id</h1>
    <hr>

    <input type="number"  name="tvId"  />
    <input type="submit" class="registerbtn" value="Search"/>
  </div>
  </form>
  
  <h1>Tv is: </h1>
<h3> ${retrieved} </h3>
 
 
 


</body>
</html>