<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 17.06.2022
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Firma o numerze nip: ${cNip} </title>
</head>
<body>
<div class="container">
    <div class="row"><h1 class="display-1" class="display-1">Oto dane szukanej firmy:</h1></div>
    <div class="row"><h2>Pełna nazwa to:</h2>
        <p>${cName}</p></div>
    <div class="row"><h2>Numer NIP to:</h2>
        <p>${cNip}</p></div>
    <div class="row"><h2>Adres firmy to:</h2>
        <p>${cAddress}</p></div>
    <div class="row"><h2>Numer REGON to:</h2>
        <p>${cRegon}</p></div>


    <div class="row">
        <span class="col-2"><a href="/first" class="btn btn-primary">Sprawdź następną firmę</a></span>
        <span class="col-2">
        <form action="/addCompany" method="post">
        <input type="hidden" id="nip" name="nip" value="${cNip}">
        <input class="btn btn-primary" type="submit" value="Dodaj firmę do listy">

    </form>
    </span>

    </div>


</div>
</body>
</html>
