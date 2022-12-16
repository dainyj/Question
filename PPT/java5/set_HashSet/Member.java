package set_HashSet;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) { // 입력된 객체(삽입된 인스턴스) 비교
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	public int hashCode() { //integer값을 비교하기 위해 equal만 사용하면 시간이 오래 걸리므로 시간단축을 위해 hashCode사용
		return name.hashCode() + age;
	}
}
