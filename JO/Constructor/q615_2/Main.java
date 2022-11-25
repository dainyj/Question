package q615_2;

import java.util.Scanner;

class Score {   //클래스1
	Scanner sc = new Scanner(System.in);
	
	private Student[] stu; // 배열 Score의 멤버변수 

	public Score() {
		stu = new Student[2];    // heap영역에 주소값이 들어가는 배열이 생성
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, kor, eng); // heap영역에 생성된 주소값이 들어가는 배열에 각각 heap영역에 생성
		}

		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
	}

	public int getAvgKor() {
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i].getKor();
		}
		return sum / stu.length;
	}

	public int getAvgEng() {
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i].getEng();
		}
		return sum / stu.length;
	}

	public void printAvg() {
		System.out.println("avg " + getAvgKor() + " " + getAvgEng());
	}
}

class Student { //클래스2
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
}

public class Main { //클래스3
	public static void main(String[] args) {
		Score sco = new Score();
		sco.printAvg();
	}
}