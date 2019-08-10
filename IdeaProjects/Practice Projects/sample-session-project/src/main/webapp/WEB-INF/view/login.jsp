<%--
  Created by IntelliJ IDEA.
  User: ekanshgupta
  Date: 29/07/19
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head></head>

<body>
<h1>Login</h1>

<form name='f' action="login" method='POST'>

    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td>Remember Me:</td>
            <td><input type="checkbox" name="remember-me" /></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>

</form>

</body>
</html>

