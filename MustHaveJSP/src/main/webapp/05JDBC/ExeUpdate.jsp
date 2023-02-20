<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="common.DBConnPool" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 추가 테스트(executeUpdate() 사용)</h2>
	
	<%
	JDBConnect jdbc=new JDBConnect();
	
	String id="testID";
	String pass="1111";
	String name="테스트회원";
	
	String sql="INSERT INTO member VALUES (?,?,?,sysdate)";
	PreparedStatement pstmt=jdbc.con.prepareStatement(sql);
	
	pstmt.setString(1,id);
	pstmt.setString(2,pass);
	pstmt.setString(3,name);
	
	int result=pstmt.executeUpdate();
	out.println(result+"행이 입력되었습니다.");
	
	jdbc.close();
	%>
</body>
</html>