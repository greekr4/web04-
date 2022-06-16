<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%response.setCharacterEncoding("utf-8"); %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>HomeZZ</title>
</head>
<body>

<table>
<tr>
<th>글번호</th>
<th>제목</th>
</tr>
<c:forEach items="${list2 }" var="DTO">
<tr>
<td>${DTO.no }</td>
<td>${DTO.tit }</td>
</tr>
</c:forEach>
</table>

 <h1>zz</h1>
</body>
</html>
