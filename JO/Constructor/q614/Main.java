package q614;

import java.util.Scanner;

class student {
	private String school = "Jejuelementary";
	private int grade = 6;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	student() {

	}

	student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int G = sc.nextInt();
//		System.out.println(G + " grade in " + S + " School");
		sc.close();

		student s1 = new student();
		s1.print();
//		System.out.println(s1.getGrade() + " grade in " + s1.getSchool() + " School");

		student s2 = new student(S, G);
		s2.print();
//		System.out.println(G + " grade in " + S + " School");

	}
}
