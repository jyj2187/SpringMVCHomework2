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

	<h2>학기별 이수 학점 조회</h2>

	<table align="center" border="1">
		<tr>
			<td>년도</td>
			<td>학기</td>
			<td>이수학점</td>
			<td>상세보기</td>
		</tr>
		<c:forEach var="myclass" items="${myclass}">
			<tr>
				<td><c:out value="${myclass.year}"></c:out></td>
				<td><c:out value="${myclass.semester}"></c:out></td>
				<td><c:out value="${myclass.credit}"></c:out></td>
				<td><a
					href="${pageContext.request.contextPath}/semesterdetail?year=${myclass.year}&semester=${myclass.semester}">상세보기</a></td>
			</tr>

		</c:forEach>
	</table>

	<p>
		<a href="${pageContext.request.contextPath}/">메인으로 가기</a>
	</p>

</body>
</html>