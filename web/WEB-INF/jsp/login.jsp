<%-- 
    Document   : Login
    Created on : May 5, 2015, 11:49:20 PM
    Author     : Saurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Login Your Spring App</h1>
        <c:url var="action" value="/login" />
        <form:form action="${action}" method="post" commandName="user">
           
            <form:label path="uname">User Name </form:label>
            <form:input path="uname" /><br>
            
            <form:label path="pass">Password </form:label>
            <form:input path="pass" /><br>
            
            <input type="submit" value="Login"/>
            <c:out value="${msg}" />
            
        </form:form>
            <br><br>
            If Login Failed <h2><a href="<c:url value='/reg' />">Create Account</a></h2>
            
    </body>
</html>
