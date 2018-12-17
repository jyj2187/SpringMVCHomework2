<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>현재 수강 신청된 과목 조회</h2>

	<table align="center" border="1">
		<tr>
			<td>수강년도</td>
			<td>학기</td>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>

		<c:forEach var="registeredclass" items="${registeredclass}">
			<tr>
				<td>2019</td>
				<td>1</td>
				<td><c:out value="${registeredclass.code}"></c:out></td>
				<td><c:out value="${registeredclass.name}"></c:out></td>
				<td><c:out value="${registeredclass.course}"></c:out></td>
				<td><c:out value="${registeredclass.credit}"></c:out></td>

			</tr>

		</c:forEach>

	</table>

	<p>
		<a href="${pageContext.request.contextPath}/">메인으로 가기</a>
	</p>
</body>
</html>