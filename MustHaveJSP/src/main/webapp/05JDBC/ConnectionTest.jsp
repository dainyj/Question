<%@ page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2>JDBD 테스트</h2>
	<%
	JDBConnect jdbc1 = new JDBConnect();

	jdbc1.close();
	%>

	<%
	JDBConnect jdbc3 = new JDBConnect(application);
	jdbc3.close();
	%>

</body>
</html>