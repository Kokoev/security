<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>

    <title>Home</title>
</head>
<body>
<form method="get" action="/editProfile">
    <p>Hello your id= ${id}!</p>
    <p>Hello = ${user.login}!</p>
    <p>Hello your password= ${user.password}!</p>
    <p><input type="submit" value="edit profile">

    <a href="/logout">security_logout</a>
</form>


</body>
</html>
