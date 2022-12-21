package p634;

import java.util.HashSet;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>(); // 데이터 중복X, 순서정렬X

		set.add(new String("abc"));
		set.add("abc");
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		System.out.println(set);
	}

}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {// 이 메서드로 중복 판단 
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() { //String 클래스의 hashCode();를 따로 메서드로 추가해줘야한다.
		return (name + age).hashCode();
	} // 객체를 구분하기 위한 메서드

	public String toString() {
		return name + ":" + age;
	}

}
