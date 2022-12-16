package set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>(); // 인스턴스 선언?

		set.add(new Member("홍길동", 30)); // 인스턴스 삽입
		set.add(new Member("홍길동", 30)); // 인스턴스 삽입

		System.out.println("총 객체 수  : " + set.size());
	}
}
