<%@ page import="utils.JSFunction" %>
<%@ page import="java.io.FileNotFoundException" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.File" %>
<%@ page import="java.io.OutputStream" %>
<%@ page import="java.io.InputStream" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String saveDirectory = application.getRealPath("/Uploads");
String saveFilename = request.getParameter("sName");
String originalFilename = request.getParameter("oName");

try{
	// 파일을 찾아 입력 스트링 생성
	File file = new File(saveDirectory, saveFilename);
	InputStream inStream = new FileInputStream(file);
	
	//한글 파일명 깨짐 방지
	String client = request.getHeader("User-Agent");
}
catch(Exception e){
	
}

%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>