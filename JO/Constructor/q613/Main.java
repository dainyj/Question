package q613;
// get set 사용해서 다시 작성해보기
import java.util.Scanner;

class student {
	private String Name;
	private String School;
	private String Grade;

	public student(String Name, String School, String Grade) {
		this.Name = Name;
		this.School = School;
		this.Grade = Grade;
	}

	public void print() {
		System.out.println("Name : " + Name);
		System.out.println("School : " + School);
		System.out.println("Grade : " + Grade);

	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];

		for (int i = 0; i < 3; i++) {
			str[i] = sc.next();
//				System.out.print(str[i] + " ");
		}
		sc.close();

		student p = new student(str[0], str[1], str[2]);
		p.print();
	}
}
