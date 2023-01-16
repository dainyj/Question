package db;

public class NoticeVo {
	private String TITLE, CONTENT, ID, ROWNUM;

	public NoticeVo() {
		super();
	}

	public NoticeVo(String TITLE, String CONTENT, String ID, String ROWNUM) {
		this.TITLE = TITLE;
		this.CONTENT = CONTENT;
		this.ID = ID;
		this.ROWNUM = ROWNUM;
	}
	
	public NoticeVo(String ROENUM) {
		
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}

	public String setID() {
		return ID;
	}

	public void getID(String ID) {
		this.ID = ID;
	}

	public String setROWNUM() {
		return ROWNUM;
	}

	public void getROWNUM(String ROWNUM) {
		this.ROWNUM = ROWNUM;
	}

}
