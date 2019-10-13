<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mytag" uri="MyFirstTag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Shop Car</title>
</head>
<body>
<h4>Session List:</h4>
<hr>
<br>
<br>
<mytag:beerColorTag/>
<%--使用自定义标签--%>
<%--<c:forEach var="selected" items="${sessionList}">--%>
<%--    ${selected}--%>
<%--    <hr>--%>
<%--</c:forEach>--%>

</body>
</html>