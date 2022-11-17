package family2;

public class Child extends Parent {
	public int ChildNo;

	Child(String name, String ssn, int childNo) {
		super(name, ssn);  // 부모 클래스 생성자 호출
		this.ChildNo = childNo;
	}
}
