<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>User Welcome</title>
</head>
<body>

<%
    // 1. Reading Strings
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    // 2. Converting String to int (The fix!)
    String rollStr = request.getParameter("number");
    int rollno = 0; 
    
    if (rollStr != null && !rollStr.isEmpty()) {
        rollno = Integer.parseInt(rollStr);
    }
%>

<h2>Welcome, <%= name %>!</h2>
<p>Your Email: <%= email %></p>
<p>Your Roll Number: <%= rollno %></p>

</body>
</html>