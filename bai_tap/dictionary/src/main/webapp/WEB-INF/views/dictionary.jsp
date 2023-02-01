<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 17/01/2023
  Time: 1:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Dictionary</h1>
<form action="/dictionary" method="post">
    <input type="text" name="word" value="${word}" placeholder="Input your word">
    <input type="submit" value="Translate">
</form>
    <input type="text" value="${result}" readonly>
</body>
</html>
