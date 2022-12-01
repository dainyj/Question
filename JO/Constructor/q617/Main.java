/*5명의 이름과 키를 입력받아 키가 가장 작은 사람의 이름과 키를 
 * 출력하는 프로그램을 작성하시오. 이름은 20자 이하이다.
*/
//	5명 이름 키 입력
//	키가 가장 작은 사람 이름 키 출력

//  1.이름 키 입력:배열 사용 2.
package q617;

import java.util.Scanner;

class Person { // 이름 키 정보 입력, 배열? 문자? 숫자? 1. 전부 문자 2. 각각 따로
	private String name;
	private int height;
	
	

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public Person() {
	}

	public String getN() {
		return name;
	}

	public int getH() {
		return height;
	}

	public void print() {
		System.out.println(name + " " + height);

	}
}

class Calc {// 키 계산

}

public class Main {
	public static void main(String[] args) {
		Person[] p = new Person[5]; // heap영역에 주소값이 들어갈 메모리 할당받음.
		Scanner sc = new Scanner(System.in);

		for (int i = 0, j = 0; i < p.length; i++, j += 2) {
			String n = sc.next();
			int h = sc.nextInt();
			p[i] = new Person(n, h); // 인스턴스 생성 마무리. 위에서 주소값만 받았음.
		}
		sc.close();
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]); // 주소값

		}

		Person a = new Person();
		a.print();// 얘도 주소값?
	}

}
