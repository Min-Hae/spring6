<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sform" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
* 회원 추가 *<br>
<sform:form>
아이디 : <sform:input path="id"/><br>
회원명 : <sform:input path="name"/><br>
비밀번호 : <sform:input path="passwd"/><br>
<br>
<input type="submit" value="등록">

</sform:form>
</body>
</html>