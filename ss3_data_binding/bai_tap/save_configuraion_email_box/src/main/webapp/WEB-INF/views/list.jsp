<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 06/02/2023
  Time: 8:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Email</h1>
<a href="/email/create">Add new</a>
<table border="1">
    <tr>
        <th>Languages</th>
        <th>Page Size</th>
        <th>Spams Filter</th>
        <th>Signature</th>
    </tr>
    <c:forEach items="${emailList}" var="email">
        <tr>
        <td>${email.languages}</td>
        <td>${email.pageSize}</td>
        <td>${email.spamsFilter}</td>
        <td>${email.signature}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
