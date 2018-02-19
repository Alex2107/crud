<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<c:out value="${books}"/>--%>

<table>

    <c:forEach var="book" items="${books}">
        <tr>
            <td>
                <c:out value="${book.id}"/>
            </td>
            <td>
                <c:out value="${book.author}"/>
            </td>
            <td>
                <c:out value="${book.description}"/>
            </td>

            <td>
                <c:out value="${book.isbn}"/>
            </td>
            <td>
                <c:out value="${book.printYear}"/>
            </td>

            <td>
                <c:out value="${book.readAlready}"/>
            </td>
            <td>
                <c:out value="${book.title}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
