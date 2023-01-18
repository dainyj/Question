package db;

public class MyMuseVo {
	private String NAME;
	private String CITY;

	public MyMuseVo() {
		super();
	}

	public MyMuseVo(String NAME, String CITY) {
		super();
		this.NAME = NAME;
		this.CITY = CITY;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String CITY) {
		this.CITY = CITY;
	}

}
