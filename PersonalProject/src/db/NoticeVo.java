package db;

public class NoticeVo {
	private String TITLE, CONTENT, ID, NUM;

	public NoticeVo() {
		super();
	}

	public NoticeVo(String NUM, String ID, String TITLE, String CONTENT) {
		this.TITLE = TITLE;
		this.CONTENT = CONTENT;
		this.ID = ID;
		this.NUM = NUM;
	}
	
	public NoticeVo(String NUM, String TITLE, String ID) {
		this.NUM = NUM;
		this.TITLE = TITLE;
		this.ID = ID;
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

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getNUM() {
		return NUM;
	}

	public void setROWNUM(String NUM) {
		this.NUM = NUM;
	}

}
