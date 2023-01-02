package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MuseDAO { // 오픈 API DB에 삽입하는 클래스
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;

	public void connDB() { // 드라이버 연결, 계정 연결
		try {
			Class.forName(driver); // 드라이버 연결(위에 문자열 선언해둠)
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password); // 계정 연결
			System.out.println("oracle connection success.");
//			stmt = con.createStatement();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MuseVo> mlist(String BIZPLC_NM, String MUSEUM_ARTGLRY_TYPE_NM, String SIGUN_NM, String REFINE_ROADNM_ADDR, String BSN_STATE_NM){
		ArrayList<MuseVo> mlist = new ArrayList<MuseVo>();
		
		try {
			connDB();
			String sql = "INSERT INTO MUSEUM VALUES('" + BIZPLC_NM + "','" + MUSEUM_ARTGLRY_TYPE_NM + "','" + SIGUN_NM + "','" + REFINE_ROADNM_ADDR + "','" + BSN_STATE_NM + "')";
			
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		return mlist;
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
