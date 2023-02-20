package test9;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[5];
		Person[] person = new Person[5];

		for (int i = 0; i < stu.length; i++) {
			String no = sc.next();
			String name = sc.next();
			person[i] = new Person(no, name);
//			System.out.println(person[i]);
//			person[i].infoPrint();
			int java = sc.nextInt();
			int html = sc.nextInt();
			int sum = java + html;
//			System.out.println(person[i]);
			stu[i] = new Student(java, html, sum);
//			System.out.println(stu[i]);
		}
		sc.close();

		Student.studentSort(stu, stu.length, person);
	}
}
