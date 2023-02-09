<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 08/02/2023
  Time: 7:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Medical Declaration</h1>
<a href="/medical/create">Add new</a>
<table border="1">
    <tr>
        <th>Họ và tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>Số CMND</th>
        <th>Thông tin đi lại</th>
        <th>Số hiệu phương tiện</th>
        <th>Số ghế</th>
        <th>Ngày khởi hành</th>
        <th>Ngày kết thúc</th>
        <th>Thông tin khác</th>
    </tr>
    <c:forEach items="${medicalList}" var="medical">
        <tr>
            <td>${medical.fullName}</td>
            <td>${medical.birthday}</td>
            <td>${medical.gender}</td>
            <td>${medical.country}</td>
            <td>${medical.idCard}</td>
            <td>${medical.vehicle}</td>
            <td>${medical.licensePlates}</td>
            <td>${medical.numberOfSeating}</td>
            <td>${medical.startOfDay}/${medical.startOfMonth}/${medical.startOfYear}</td>
            <td>${medical.endOfDay}/${medical.endOfMonth}/${medical.endOfYear}</td>
            <td>${medical.otherInformation}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
