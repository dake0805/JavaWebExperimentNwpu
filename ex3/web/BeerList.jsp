﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%--<c:if test="${param.color eq 'amber'}">--%>
<%--    <jsp:forward page="ShowAmberBeer.jsp"/>--%>
<%--</c:if>--%>

<%--<c:if test="${param.color eq 'brown'}">--%>
<%--    <jsp:forward page="ShowBrownBeer.jsp"/>--%>
<%--</c:if>--%>

<%--<c:if test="${param.color eq 'dark'}">--%>
<%--    <jsp:forward page="ShowDarkBeer"/>--%>
<%--</c:if>--%>


<%--改写BeerList.jsp文件中的<c:if>标签，转化为<c:choose>标签--%>
<c:choose>
    <c:when test="${param.color eq 'amber'}">
        <jsp:forward page="ShowAmberBeer.jsp"/>
    </c:when>
    <c:when test="${param.color eq 'brown'}">
        <jsp:forward page="ShowBrownBeer.jsp"/>
    </c:when>
    <c:when test="${param.color eq 'dark'}">
        <jsp:forward page="ShowDarkBeer"/>
    </c:when>
</c:choose>


<jsp:include page="Header_act.jsp">
    <jsp:param name="subTitle" value="Welcome to the Light Beer World!"/>
</jsp:include>
<c:import url="DisplayItem.jsp"/>
