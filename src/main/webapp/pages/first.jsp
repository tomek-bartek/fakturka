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
    <title>Pierwsza faktura</title>
</head>
<body>
    <h1>Sprawdź czy firma jest czynnym podatnikiem VAT</h1>
    <form action="/company" method="get">
        <label>Podaj NIP firmy</label>:</label>

        <input type="text" id="nip" name="nip">

         <input type="submit" value="Submit">

    </form>
</body>
</html>
