<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h2>학기별 이수 학점 조회 상세보기</h2>
	<table align="center" border="1">
		<tr>
			<td>수강년도</td>
			<td>학기</td>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>

		<c:forEach var="myclassd" items="${myclassd}">
			<tr>
				<td><c:out value="${myclassd.year}"></c:out></td>
				<td><c:out value="${myclassd.semester}"></c:out></td>
				<td><c:out value="${myclassd.code}"></c:out></td>
				<td><c:out value="${myclassd.name}"></c:out></td>
				<td><c:out value="${myclassd.course}"></c:out></td>
				<td><c:out value="${myclassd.credit}"></c:out></td>

			</tr>

		</c:forEach>

	</table>

	<p>
		<a href="${pageContext.request.contextPath}/">메인으로 가기</a>
	</p>
</body>
</html>