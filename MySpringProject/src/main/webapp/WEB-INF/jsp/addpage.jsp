<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Tv</title>
</head>
<body>


<form:form action="hashmapAdd" method="POST" modelAttribute="tv">
  <div class="container">
    <h1>Register</h1>
    <p>Please Add the following information</p>
    <hr>

    <label for="name"><b>Name</b></label>
    <form:input type="text" placeholder="Enter Name" name="name" required="true" path="name"/>

    <label for="brand"><b>Brand Name</b></label>
    <form:input type="text" placeholder="Enter Brand Name" name="brand" required="true" path="brand"/>

    <label for="price"><b>Price</b></label>
    <form:input type="text" placeholder="Enter Price" name="price" path="price" required="true" />


    <input type="submit" class="registerbtn" value="Add"/>
  </div>
  </form:form>

</body>
</html>