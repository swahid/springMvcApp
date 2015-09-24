<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Spring CRUD.</p>
        <c:url var="action" value="/add" />
        <form:form action="${action}" method="post" commandName="manufacture">
            <c:if test="${not empty manufacture.id}">
                <form:label path="id">Id  </form:label>
                <form:input path="id" /><br>
            </c:if>
            
            <form:label path="name">Name </form:label>
            <form:input path="name" /><br>
            
            <form:label path="address">Address </form:label>
            <form:input path="address" /><br>
            
            <form:label path="contactno">Contact no</form:label>
            <form:input path="contactno" /><br><br>
            
            <c:if test="${empty manufacture.id}">
            <input type="submit" value="Insert"/>
            </c:if>
           
            <c:if test="${not empty manufacture.id}">
            <input type="submit" value="Update"/>
            </c:if>
        </form:form>
            <br><br><br><br>
            Manufacture Table Data
            <table border="0" cellpadding="10">
                <thead>
                    <tr>
                        <th>Manufacture ID</th>
                        <th> Name</th>
                        <th> Address</th>
                        <th>Contact_No</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${manufacturelist}" var="m">
                    <tr>
                        <td>${m.id}</td>
                        <td>${m.name}</td>
                        <td>${m.address}</td>
                        <td>${m.contactno}</td>
                        <td> <a href="<c:url value='/edit/${m.id}' />">Edit</a> </td>
                        <td> <a href="<c:url value='/delete/${m.id}' />">Delete</a> </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <br><br><br>
            <h2><a href="<c:url value='/' />">LogOut</a></h2>
    </body>
</html>
