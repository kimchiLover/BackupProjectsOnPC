<%--
  Created by IntelliJ IDEA.
  User: ekanshgupta
  Date: 29/07/19
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Success Page</title>
</head>
<body>

<h3>Success Page</h3>
Welcome ${sessionScope.username }
<br>
<a href="${pageContext.request.contextPath }/account/logout">Logout</a>

</body>
</html>