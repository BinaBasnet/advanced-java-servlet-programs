<%@ page language="java" %>

<html>
<head>
<title>JSP Tags</title>
</head>
<body>

<%! int a = 10, b = 20; %>

<%
    int sum = a + b;
%>

Sum using scriptlet: <%= sum %>

</body>
</html>
