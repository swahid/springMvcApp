<%-- 
    Document   : index
    Created on : May 6, 2015, 12:49:16 AM
    Author     : shuvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Spring MVC Annotation Based Application</h1>
         <br><br>
        <h2><a href="<c:url value='/login' />">Login</a></h2>
        <h2><a href="<c:url value='/reg' />">Registration</a></h2>
    </body>
</html>
