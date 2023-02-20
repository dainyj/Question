package q196;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		case2 더 풀어야함.
//		Person[] person = new Person[3];
//		for (int i = 0; i < person.length; i++) {
//			person[i] = new Person(sc.next(), sc.next(), sc.next());
//			person[i].print();
//		}
//		sc.close();
//		
//		Arrays.sort(person);
//		System.out.println(person[0]);
//		person[0].print();


//		case1---------------------------------------------------------------
		String[] inp = new String[3];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextLine();
//			System.out.println(inp[i]);
		}
		
		sc.close();

		Arrays.sort(inp);
		Person[] p = new Person[inp.length];

		String[] arr = inp[0].split(" ");

		p[0] = new Person(arr[0], arr[1], arr[2]);
		p[0].print();
		System.out.println();
		
//------------------------------------------------------------------------
	}
}

class Person {
	private String name;
	private String tel;
	private String addr;

	public Person(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

}