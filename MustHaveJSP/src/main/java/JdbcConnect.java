package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class JdbcConnect {
	public Connection conn;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	public JdbcConnect() {
		super();
		try {
			//WEB-INF의 lib에 ojdbc8.jar를 import한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="c##green";
			String pwd="green1234";
			conn=DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공(기본 생성자)");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(pstmt!=null) pstmt.close();
			
			System.out.println("JDBC 자원 해제");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public JdbcConnect(String driver, String url,String id,String pwd) {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공 - 생성자 2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public JdbcConnect(ServletContext application) {
		String driver=application.getInitParameter("OracleDriver");
		try {
			Class.forName(driver);
			String url=application.getInitParameter("OracleURL");
			String id=application.getInitParameter("OracleID");
			String pwd=application.getInitParameter("OraclePwd");
			conn=DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공 - 생성자 3 - 생성자 내에서 web.xml param 가져오기");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
