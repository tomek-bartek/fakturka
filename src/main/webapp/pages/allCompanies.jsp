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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Wszystkie ostatnio sprawdzane firmy</title>
</head>
<body>

<div class="container">
    <div class="row"> <h1 class="display-3">Wszystkie dodane firmy:</h1>  </div>
<table class="table">
    <thead>
    <tr>

        <th scope="col">NIP</th>
        <th scope="col">Pełna nazwa firmy</th>
        <th scope="col">Adres</th>
        <th scope="col">Numer REGON</th>
       

    </tr>
    </thead>
    <c:forEach items="${listOfCompanies}" var="item">
        <tr>
            <td><c:out value="${item.cNip}" /></td>
            <td><c:out value="${item.cName}" /></td>
            <td><c:out value="${item.cAddress}" /></td>
            <td><c:out value="${item.cRegon}" /></td>

        </tr>
    </c:forEach>
</table>
<div class="row">
    <a href="/first" class="btn btn-primary col-2">Sprawdź następną firmę</a>

</div></div>
</body>
</html>
