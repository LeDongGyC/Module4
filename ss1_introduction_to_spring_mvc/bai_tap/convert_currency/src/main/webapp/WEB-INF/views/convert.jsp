<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 17/01/2023
  Time: 12:59 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Convert Currency</h1>
<form action="/convert" method="post">
    <fieldset>
        <legend>Convert Currency</legend>
        <table>
            <tr>
                <td>Rate</td>
                <td><input type="text" name="rate"></td>
            </tr>
            <tr>
                <td>USD</td>
                <td><input type="text" name="usd"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Convert"></td>
            </tr>
        </table>
    </fieldset>
</form>
<p><span>${vnd}</span></p>
</body>
</html>
