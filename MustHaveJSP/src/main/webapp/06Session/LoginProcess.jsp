<%@ page import="membership.MemberDTO"%>
<%@ page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%  
// 로그인 폼으로부터 받은 아이이와 패스워드
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pw");

String oracleDriver = application.getInitParameter("OracleDriver");
String oracleURL= application.getInitParameter("OracleURL");
String oracleId= application.getInitParameter("OracleId");
String oraclePwd= application.getInitParameter("OraclePwd");


MemberDAO dao = new MemberDAO(oracleDriver, oracleURL, oracleId, oraclePwd);


System.out.println("LoginProcess.jsp : " + userId + ":" + userPwd);
MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);
dao.close();

System.out.println("memberDTO.getName() : " + memberDTO.getName());

if(memberDTO.getId() != null){
	session.setAttribute("UserId", memberDTO.getId());
	session.setAttribute("UserName", memberDTO.getName());
	response.sendRedirect("LoginForm.jsp");
}
else{
	request.setAttribute("LogonErrMsg", "로그인 오류입니다.");
	request.getRequestDispatcher("LogonForm.jsp").forward(request, response);
}
	%>
