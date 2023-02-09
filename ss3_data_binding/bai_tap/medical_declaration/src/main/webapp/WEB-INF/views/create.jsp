<%--
  Created by IntelliJ IDEA.
  User: fpt
  Date: 08/02/2023
  Time: 8:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
    </style>
</head>
<body>
<h1 style="text-align: center">Tờ khai y tế</h1>
<h3 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ ĐƯỢC CƠ QUAN Ý TẾ LIÊN LẠC KHI CẦN
    THIẾT ĐỂ DỀ PHÒNG DỊCH BỆNH TRUYỀN NHIỄM</h3>
<h4 style="text-align: center;color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử
    lí hành sự</h4>
<form:form modelAttribute="medical" action="/medical/create" method="post">
    <table border="1">
        <tr>
            <td>Họ tên</td>
            <td><form:input path="fullName"></form:input></td>
        </tr>
        <tr>
            <td>Năm sinh</td>
            <td style="width: calc(100%/3)"><form:select path="birthday" items="${yearOfBirthday}"><form:options
                    items="${yearOfBirthday}"></form:options></form:select></td>
        </tr>
        <tr>
            <td>Giới tính</td>
            <td style="width: 33.33%"><form:select path="gender" items="${genders}"><form:options
                    items="${genders}"></form:options></form:select></td>
        </tr>
        <tr>
            <td>Quốc tịch</td>
            <td style="width: 33.33%"><form:select path="country" items="${country}"><form:options
                    items="${country}"></form:options></form:select></td>
        </tr>
        <tr>
            <td>Số hộ chiếu hoặc CMND</td>
            <td><form:input path="idCard"></form:input></td>
        </tr>
        <tr>
            <td>Thông tin đi lại</td>
            <td>
                <form:checkbox path="vehicle" value="Tàu bay"></form:checkbox>Tàu bay
                <form:checkbox path="vehicle" value="Tàu thuyền"></form:checkbox>Tàu thuyền
                <form:checkbox path="vehicle" value="Ô tô"></form:checkbox>Ô tô
                <form:checkbox path="vehicle" value="khác"></form:checkbox><form:input path=""></form:input>
            </td>
        </tr>
        <tr>
            <td>Số hiệu phương tiện</td>
            <td>
                <form:input path="licensePlates"></form:input>
            </td>
        </tr>
        <tr>
            <td>Số ghế ngồi</td>
            <td>
                <form:input path="numberOfSeating"></form:input>
            </td>
        </tr>
        <tr>
            <td>Ngày khởi hành</td>
            <td>
                <form:select path="startOfDay" items="${day}"><form:options items="${day}"></form:options></form:select>
                <form:select path="startOfMonth" items="${month}"><form:options
                        items="${month}"></form:options></form:select>
                <form:select path="startOfYear" items="${year}"><form:options
                        items="${year}"></form:options></form:select>
            </td>
        </tr>
        <tr>
            <td>Ngày kết thúc</td>
            <td>
                <form:select path="endOfDay" items="${day}">
                    <form:options items="${day}"></form:options>
                </form:select>
                <form:select path="endOfMonth" items="${month}">
                    <form:options items="${month}"></form:options>
                </form:select>
                <form:select path="endOfYear" items="${year}">
                    <form:options
                            items="${year}"></form:options>
                </form:select>
            </td>
        <tr>
            <td>Khác</td>
            <td><form:input path="otherInformation"></form:input></td>
        </tr>
        <tr>
            <td><form:button>Save</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
