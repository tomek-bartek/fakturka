<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 18.06.2022
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Wszystkie dodane firmy</title>
</head>
<body>
<table>
    <c:forEach items="${listOfCompanies}" var="item">
        <tr>
            <td><c:out value="${item}" /></td>
        </tr>
    </c:forEach>
</table
</body>
</html>
