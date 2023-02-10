package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Execute { // 쿼리받아서 실행 클래스
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public void connDB() { // 드라이버 연결, 계정 연결
		try {
			Class.forName(driver); // 드라이버 연결(위에 문자열 선언해둠)
//			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password); // 계정 연결
//			System.out.println("oracle connection success.");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	게시글 수정
	public String[] eidtQuery(String sql) {
		String[] strsum = new String[3];
		try {
			System.out.println("쿼리 실행");
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strTitle = rs.getString("TITLE");
				String strContent = rs.getString("CONTENT");
				String num = rs.getString("NUM");
//				System.out.println("쿼리 결과 : " + strTitle + strContent + num);
				strsum[0] = strTitle;
				strsum[1] = strContent;
				strsum[2] = num;

//				System.out.println("배열에 넣었을 때 : " + strsum[0] + " " + strsum[1] + " " + strsum[2]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return strsum;
	}

//	게시글 수 확인 쿼리 실행
	public int cntrunQuery(String sql) {
		int num = 0;
		try {
			System.out.println("쿼리 실행");
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				num = rs.getInt("CNT");
			}
			System.out.println("CNT : " + num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

//  쿼리 실행해서 MuseVo에 저장하는 메서드
	public ArrayList<MuseVo> list(String sql) { // 쿼리 실행해서 MuseVo에 저장하는 메서드
		ArrayList<MuseVo> muselist = new ArrayList<MuseVo>();
//		connDB();
		try {
//			System.out.println("MuseVo에 저장-이름,주소");
//			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strbn = rs.getString("BIZPLC_NM");
				String stradd = rs.getString("REFINE_ROADNM_ADDR");
				MuseVo data = new MuseVo(strbn, stradd);
				muselist.add(data);
//					System.out.println(strbn + " " + stradd + "\n" + list.add(data)));
//					System.out.println();
			}
//			rs.close();
//			stmt.close();
//			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return muselist;
	}

//	쿼리 실행하여 Vo로 저장
	public ArrayList<MuseVo> list2(String sql) { // 쿼리 실행해서 MuseVo에 저장하는 메서드
		ArrayList<MuseVo> muselist = new ArrayList<MuseVo>();
//		connDB();
		try {
//			System.out.println("MuseVo에 저장 - 종류,이름,도시");
//			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strtn = rs.getString("MUSEUM_ARTGLRY_TYPE_NM");
				String strbn = rs.getString("BIZPLC_NM");
				String strcn = rs.getString("SIGUN_NM");
				MuseVo data = new MuseVo(strtn, strbn, strcn);
				muselist.add(data);
			}
//			rs.close();
//			stmt.close();
//			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return muselist;
	}

//	여러개 출력 프로그램
	public String[] printResult(String sql) {
		String strbn = "", stradd = "";
//		System.out.println("list 출력");
		ArrayList<MuseVo> muselist = list(sql);
		// list(sql)의 list는 이 클래스 안에 있는 메서드 호출한 것
		String[] mulist = new String[muselist.size()];
		for (int i = 0; i < muselist.size(); i++) {
			MuseVo data = (MuseVo) muselist.get(i);
//			System.out.println(muselist.get(i));
			strbn = data.getBIZPLC_NM();
			stradd = data.getREFINE_ROADNM_ADDR();
			String mlist = " - " + strbn + "\n" + "      주소 : " + stradd + "\n\n";
//			System.out.println(mlist);
			mulist[i] = mlist;
		}
		return mulist;
	}

//	마이f > 선택 후 자세히 보기
	public String printRes(String sql) { // 하나만 전송됨. 여러개 전송하려면 배열로 넘겨야할듯
//		connDB();
		String mlist = "";
		try {
//			System.out.println("마이f 선택 후 자세히 보기");
//			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strbn = rs.getString("BIZPLC_NM");
				String strcn = rs.getString("SIGUN_NM");
				String stradd = rs.getString("REFINE_ROADNM_ADDR");
				mlist = "\n   " + strbn + " (" + strcn + ")\n\n" + "	    주소 : " + stradd + "\n\n";
//				System.out.println(mlist);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return mlist;
	}

//	검색f > 저장버튼으로 삽입실행
	public void insertMypage(String sql) {
//		connDB();
		try {
//			System.out.println("개인DB에 삽입");
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

//	마이f > 기본 화면에 띄울 데이터 Vo에 저장 후 리턴
	public ArrayList<MyMuseVo> printBasics(String sql) {
//		connDB();
		ArrayList<MyMuseVo> mylist = new ArrayList<MyMuseVo>();// DB 불러와서 저장할 ArrayList 생성
		try {
//			System.out.println("마이f 기본 화면에 띄울 데이터 Vo에 저장");
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strName = rs.getString("BIZPLC_NM");
				String strCity = rs.getString("SIGUN_NM");
				MyMuseVo data = new MyMuseVo(strName, strCity);
				mylist.add(data);
			}
//			rs.close();
//			stmt.close();
//			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return mylist;
	}

//	게시판 글 목록
	public ArrayList<NoticeVo> notice(String sql) {
		ArrayList<NoticeVo> notelist = new ArrayList<NoticeVo>();
		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strNum = rs.getString("NUM");
				String strTitle = rs.getString("TITLE");
				String strId = rs.getString("ID");
				NoticeVo data = new NoticeVo(strNum, strTitle, strId);
				notelist.add(data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notelist;
	}

//	단순 쿼리 실행
	public void runQuery(String sql) {
		try {
			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

} // class end
