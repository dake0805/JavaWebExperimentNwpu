<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 10/13/2019
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("name")) {
                response.sendRedirect("Login.do");
            }
        }
    }
%>

<html>
<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>

<body bgcolor="#FFFFFF">
<h1 align="center">User Login</h1>
<hr>
<p>
    <b>User information:</b>
</p>
<form method="post" action="Login.do">
    <table width="500" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="100">User name:</td>
            <td width="431"><input type="text" name="name"></td>
        </tr>
        <tr>
            <td width="100">Password:</td>
            <td width="431"><input type="password" name="password">
            </td>
        </tr>
    </table>
    <hr>
    <p>
        <input type="submit" name="btn_submit" value="Login"> <input
            type="reset" name="btn_reset" value="Reset">
    </p>
</form>
<p>&nbsp;</p>
</body>
</html>
