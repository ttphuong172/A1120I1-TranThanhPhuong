<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/5/2021
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Kết quả</h2>
<c:if test="${not empty myError}">
    <h3>${myError}</h3>
</c:if>
<c:if test="${empty myError}" >
<c:if test="${not empty error}">
    <h3>${error}</h3>
</c:if>
<c:if test="${empty error}">
    <h3>Phép toán: ${result}</h3>
</c:if>
</c:if>
</div>
</body>
</html>
