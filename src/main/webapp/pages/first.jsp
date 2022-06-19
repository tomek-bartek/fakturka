<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 15.06.2022
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Pierwsza faktura</title>
</head>
<body>
<div class="container">
    <div class="row"><h1 class="display-3">Sprawdź czy firma jest czynnym podatnikiem VAT</h1></div>

    <div class="row">
        <form action="/company" method="get">
            <label>Podaj NIP firmy</label>:</label>

            <input type="text" id="nip" name="nip">

            <input class="btn btn-primary" type="submit" value="Szukaj">

        </form>
    </div>
</div>
</body>
</html>
