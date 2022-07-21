<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MVC dispatcher servlet</title>
</head>
<body>
    <a href="/index.html">main</a>
    <form action="save" method="post">
        username : <input type="text" name="username"/>
        age : <input type="text" name="age"/>
        <button type="submit">전송</button>
    </form>
</body>
</html>