<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
* 회원자료(@MVC-JdbcDaoSupport) *<br>
<a href="insert">회원 추가</a>
<table border="1">
	<tr><th>id</th><th>name</th><th>pwd</th><th>reg_date</th></tr>
	<c:forEach var="m" items="${list }">
	
	<tr>
	<td>${m.id }</td>
	<td>${m.name }</td>
	<td>${m.passwd }</td>
	<td>${m.reg_date }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>