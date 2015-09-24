<%-- 
    Document   : Reg
    Created on : May 5, 2015, 11:59:50 PM
    Author     : shuvo
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
        <h1>Spring registration</h1>
        
        <c:url var="action" value="/reg" />
        <form:form action="${action}" method="post" commandName="user">
           
            <form:label path="uname">User Name </form:label>
            <form:input path="uname" /><br>
            
            <form:label path="pass">Password </form:label>
            <form:input path="pass" /><br>
            <form:label path="email">Email </form:label>
            <form:input path="email" /><br>
            
            <input type="submit" value="Registration"/>
           
            ${msg}
            
        </form:form>
            <br><br>
            If Already Have Account <h2><a href="<c:url value='/login' />">Login</a></h2>
    </body>
</html>
