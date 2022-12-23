package frame_Intro_Log_Sign;

public class PMemberVo {
	private String id;
	private String password;
	private String phnum;
	private String email;

	public PMemberVo(String id, String password, String phnum, String email) {
		this.id = id;
		this.password = password;
		this.phnum = phnum;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return password;
	}

	public String getPn() {
		return phnum;
	}

	public String getEm() {
		return email;
	}

}