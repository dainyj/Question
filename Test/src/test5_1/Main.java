package test5_1;

import java.util.Scanner;

class Info {
	private String school;
	private int grade;

	public Info() {
		this.school = "Jaduelementary";
		this.grade = 6;

		System.out.println(grade + " grade in " + school + " school");
	}

	public void input(String s, int g) {
		school = s;
		grade = g;

		System.out.println(g + " grade in " + s + " school");
	}
}

public class Main {
	public static void main(String[] args) {
		Info i = new Info();

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int g = sc.nextInt();
		sc.close();

		i.input(s, g);
	}
}
