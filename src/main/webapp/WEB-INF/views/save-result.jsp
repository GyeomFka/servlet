<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mvc-save-result</title>
</head>
<body>


    <ul>
        <!--
        <li>
            id = <%=((Member)request.getAttribute("member")).getId() %>
        </li>
        -->
        <li>
            id-property접근 = ${member.id}
        </li>

        <li>
            username = <%=((Member)request.getAttribute("member")).getUsername() %>
        </li>
        <li>
            age = <%=((Member)request.getAttribute("member")).getAge() %>
        </li>
    </ul>

</body>
</html>