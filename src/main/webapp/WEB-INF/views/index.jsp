<%--
  Created by IntelliJ IDEA.
  User: tinh
  Date: 26/06/2019
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/result" method="post">
    <label>Rate: </label><br>
    <input type="text" name="rate" placeholder="RATE" value="23000"/><br>
    <label>USD: </label><br>
    <input type="text" name="usd" placeholder="USD" value="0"/><br>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>