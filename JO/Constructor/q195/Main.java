package q195;

import java.util.Scanner;
//case2
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
//		System.out.println(inp);
		sc.close();
		
		String[] arrInp = inp.split(" ");
		Person p = new Person(arrInp[0], arrInp[1], arrInp[2]);
		p.print();
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

//case 1-----------------------------------------
//public class Main {
//	public static void main(String[] args) {
//		Scan sc = new Scan();
//		Member member = new Member();
//		String str = sc.scanner();
//
//		member.stringSplit(str);
//		member.print();
//
//	}
//
//} // Main class end
//
//class Scan {
//	public String scanner() {
//		Scanner sc = new Scanner(System.in);
//		String inp = sc.nextLine();
////		System.out.println(inp);
//		sc.close();
//		return inp;
//	}
//}
//
//class Member {
//	private String name;
//	private String tel;
//	private String addr;
//
//	public void stringSplit(String inp) {
//		String[] arrInp = inp.split(" ");
////	System.out.println(arrInp[0]);
////	System.out.println(arrInp[1]);
////	System.out.println(arrInp[2]);
//
//		name = arrInp[0];
//		tel = arrInp[1];
//		addr = arrInp[2];
//	}
//
//	public void print() {
//		System.out.println("name : " + name);
//		System.out.println("tel : " + tel);
//		System.out.println("addr : " + addr);
//	}
//}