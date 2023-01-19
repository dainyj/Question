package db;

public class Query {

//	메뉴f > ALL 버튼 > 모든 박물관 리스트 출력 //연결O
	public String allQuery() {
		String allSql = "SELECT * FROM MUSEUM";
		return allSql;
	}

//	메뉴f > 지역별 버튼 > City클래스 도시별로 //연결O
	public String cityQuery(String city) {
		String citySql = "SELECT BIZPLC_NM, REFINE_ROADNM_ADDR FROM MUSEUM WHERE SIGUN_NM LIKE '%" + city + "%'";
		return citySql;
	}

//	메뉴f > 주제별 버튼 > Theme클래스 1.박물관 2.미술관 3.전시관 버튼 클릭시 각각 //연결O
	public String themeQuery(String add) {
//		버튼 클릭시 해당 add가 여기로
		String baseSql = "SELECT * FROM MUSEUM WHERE MUSEUM_ARTGLRY_TYPE_NM LIKE '%" + add + "%'";
		return baseSql;
	}

//	 Search클래스 
	public String serchQuery(String combo, String search) { // 쿼리 완성 메서드
		switch (combo) {
		case "기관명":
			combo = "BIZPLC_NM";
			break;
		case "종류":
			combo = "MUSEUM_ARTGLRY_TYPE_NM";
			break;
		case "도시":
			combo = "SIGUN_NM";
			break;
		case "주소":
			combo = "REFINE_ROADNM_ADDR";
			break;
		}
		String SearchSql = "SELECT * FROM MUSEUM WHERE " + combo + " LIKE '%" + search + "%'";

		return SearchSql;
	}

//	검색f > 저장 > ID 필요
	public String insertQuery(String A, String B, String ID) { // 필드 > / BIZPLC_NM / SIGUN_NM / ID //
		String insertSql = "INSERT INTO " + ID + " VALUES('" + A + "','" + B + "','" + ID + "')";
//		System.out.println(insertSql);
		return insertSql;
	}

//	중복제거
	public String deleteSame(String ID) {
		String sql = "DELETE FROM " + ID + " a WHERE ROWID>(SELECT MIN(rowid)FROM " + ID
				+ " a2 WHERE a2.BIZPLC_NM = a.BIZPLC_NM) ";
		return sql;
	}

	public String deleteDB(String ID, String muse) {
		String sql = "DELETE FROM " + ID + " WHERE BIZPLC_NM LIKE '" + muse + "'";
//		System.out.println(sql);
		return sql;
	}

//	count
	public String countnum() {
		String cntsql = "SELECT COUNT(*) FROM NOTICE";
		System.out.println(cntsql);
		return cntsql;
	}

//	마이f > 조회
	public String detail(String get) {
		String detailSql = "SELECT * FROM MUSEUM WHERE BIZPLC_NM LIKE '" + get + "'";
//		System.out.println(detailSql);
		return detailSql;
	}

//	마이f > 기본 화면 > ID 필요
	public String basics(String ID) {
//		String sql = "SELECT DISTINCT BIZPLC_NM FROM " + ID;
		String sql = "SELECT * FROM " + ID;
//		System.out.println(sql);
		return sql;
	}

//	게시글 등록
	public String noticeInsert(String NUM, String ID, String title, String content) {
		String sql = "Insert INTO NOTICE VALUES('" + NUM + "','" + ID + "','" + title + "','" + content + "')";
		System.out.println(sql);
		return sql;
	}

//	게시글 삭제
	public String noticeDelete(String num, String title, String ID) {
		String sql = "DELETE FROM NOTICE WHERE NUM LIKE '" + num + "' AND TITLE LIKE '" + title + "' AND ID LIKE '" + ID
				+ "'";
		System.out.println(sql);
		return sql;

	}

//	게시글 불러오기
	public String check(String num, String title) {
		String sql = "SELECT * FROM NOTICE WHERE NUM LIKE '" + num + "' AND TITLE LIKE '" + title + "'";
		return sql;
	}

//	게시판 수정할 게시글 불러오기
	public String noticeEdit(String title, String ID) {
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '" + title + "' AND ID LIKE '" + ID + "'";
		return sql;
	}

//	게시판 게시글 수정
	public String editsave(String title, String content, String num) {
		String sql = "UPDATE NOTICE SET TITLE = '" + title + "', CONTENT = '" + content + "' WHERE NUM = '" + num + "'";
		return sql;
	}

//	게시판 글 목록
	public String notice() {
		String sql = "SELECT * FROM NOTICE n ORDER by 1";
		return sql;
	}

//	게시글 수 확인
	public String noticenum() {
		String cntsql = "SELECT COUNT(*) CNT FROM NOTICE";
		return cntsql;
	}

}// class end
