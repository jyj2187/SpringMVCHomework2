<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<title>수강 신청</title>
</head>
<body>
	<h2 align="center">수강 신청</h2>

	<form method="get" action="${pageContext.request.contextPath}/doregister">
		<table class="formtable" align="center">
			<tr>
				<td class="label">수강년도:</td>
				<td class="control">2019</td>
			</tr>
			<tr>
				<td class="label">학기:</td>
				<td class="control">1</td>
			</tr>
			<tr>
				<td class="label">교과코드:</td>
				<td class="control"><input type="text" name="code" /></td>
			</tr>
			<tr>
				<td class="label">교과목명:</td>
				<td class="control"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td class="label">구분:</td>
				<td class="control"><input type="text" name="course" /></td>
			</tr>
			<tr>
				<td class="label">학점:</td>
				<td class="control"><input type="text" name="credit" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="과목 수강 신청" type="submit" /></td>
			</tr>
		</table>
	</form>
	<p>
		<a href="${pageContext.request.contextPath}/">메인으로 가기</a>
	</p>
</body>
</html>