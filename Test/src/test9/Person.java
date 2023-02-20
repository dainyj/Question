package test9;

public class Person {
	private String no, name;

	public Person() {
		no = "S001";
		name = "홍길동1";
	}

	public Person(String no, String name) {
		this.no = no;
		this.name = name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String setNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String setName() {
		return name;
	}

	public void infoPrint() {
		System.out.println("번호 : " + no);
		System.out.println("이름 : " + name);
	}
}
