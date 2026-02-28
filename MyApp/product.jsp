<html>
<body>

<form method="post">
Enter number 1: <input type="text" name="n1"><br>
Enter number 2: <input type="text" name="n2"><br>
Enter number 3: <input type="text" name="n3"><br>
<input type="submit" value="Find Product">
</form>

<%
String a = request.getParameter("n1");
String b = request.getParameter("n2");
String c = request.getParameter("n3");

if(a!=null && b!=null && c!=null){
    int n1 = Integer.parseInt(a);
    int n2 = Integer.parseInt(b);
    int n3 = Integer.parseInt(c);

    int product = n1*n2*n3;
%>

<h2>Product = <%= product %></h2>

<% } %>

</body>
</html>
