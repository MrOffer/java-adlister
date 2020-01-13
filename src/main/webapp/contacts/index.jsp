<%--
  Created by IntelliJ IDEA.
  User: thomasoffer
  Date: 1/10/20
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>
</head>
<body>
<h1>Your Contacts</h1>
<div>
    <c:forEach var="contact" items="${contacts}">
        <div>
            <h2>${contact.firstName} ${contact.lastName} - ${contact.phoneNumber}</h2>
        </div>
    </c:forEach>
</div>
<form action="/contacts/create" method="post">
    <input type="text" name="firstName" placeholder="First name">
    <input type="text" name="lastName" placeholder="Last Name">
    <input type="text" name="phoneNumber" placeholder="Phone Number">
    <button>Add Contact</button>
</form>
</body>
</html>
