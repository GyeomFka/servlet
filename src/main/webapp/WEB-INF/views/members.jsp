<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>memberList</title>
</head>
<body>
<a href="/index.html">main</a>
<table>
    <thead>
        <th>id</th>
        <th>name</th>
        <th>age</th>
    </thead>
    <tbody>
        <c:forEach var="itemInPage" items="${members}">
            <tr>
                <td>${itemInPage.id}</td>
                <td>${itemInPage.username}</td>
                <td>${itemInPage.age}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>