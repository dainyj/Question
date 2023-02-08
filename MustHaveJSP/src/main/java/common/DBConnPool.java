package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnPool {
	public Connection conn;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	public DBConnPool() {
		try {
			Context initCtx=new InitialContext();
			Context ctx=(Context)initCtx.lookup("java:comp/env");
			DataSource dataSource=(DataSource)ctx.lookup("dbcp_myoracle");
			
			conn=dataSource.getConnection();
			
			System.out.println("DB 커넥션 풀 연결 성공");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 커넥션 풀 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			
			System.out.println("DB 커넥션 풀 자원 반납");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
