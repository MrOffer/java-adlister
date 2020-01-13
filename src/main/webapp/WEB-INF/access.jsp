<%--
  Created by IntelliJ IDEA.
  User: thomasoffer
  Date: 1/13/20
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Access Page</title>
</head>
<body>
<h1>Access Page</h1>
    <form action="/admin" method="post">
        <label for adminCode>Please enter admin coide</label>
        <input type="password" placeholder="Admin Code" name="adminCode" id="adminCode">
    </form>
</body>
</html>
