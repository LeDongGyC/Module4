<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 06/02/2023
  Time: 8:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form:form modelAttribute="email" method="post" action="/email/create">
    <table>
        <tr>
            <td>Language</td>
            <td><form:select path="languages" items="${languages}">
                <form:options value="${languages}"></form:options>
            </form:select></td>
        </tr>
        <tr>
            <td>Page size</td>
            <td>Show <form:select path="pageSize" items="${sizes}">
                <form:options value="${sizes}"></form:options>
            </form:select> email per page
            </td>
        </tr>
        <tr>
            <td>Spams Filter</td>
            <td><form:checkbox path="spamsFilter" value="enable spams filter"></form:checkbox>enable spams filter</td>
        </tr>
        <tr>
            <td>Signature</td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <form:button>Save</form:button>
                <input type="reset" value="Cancel">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
