<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 03/02/2023
  Time: 8:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator/" method="post">
    <input type="text" name="num1" value="${num1}">
    <input type="text" name="num2" value="${num2}"><br><br>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(*)">
    <input type="submit" name="operator" value="Division(/)">
</form>
<h1>Result ${operator}: ${result}</h1>
</body>
</html>
