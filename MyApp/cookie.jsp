<%@ page import="javax.servlet.http.Cookie" %>
<html>
<body>

<%
Cookie c = new Cookie("username","BinaBasnet");
c.setMaxAge(24*60*60);
response.addCookie(c);
%>

Cookie Added Successfully

</body>
</html>
