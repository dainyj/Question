package q615;
/*두 명의 이름과 국어, 영어 점수를 입력받아 과목별 점수의 평균을 구하여 출력하는 프로그램을 작성해 보시오.
(이름은 20자 이하이고 평균의 소수점 이하는 버림한다.)*/

/*Junho 88 100
Seonbin 95 96*/

import java.util.Scanner;

// 객체배열 사용, 
class School {
	private String student[][];
	Scanner sc = new Scanner(System.in);
//	School s1= new School();		// 인스턴스 생성
	String[][] stu = new String[2][3]; {
	
//	for (int i = 0; i < stu.length; i++) {
//		for (int j = 0; j <stu[i].length; j++) {
//			stu[i][j] = sc.next();
//			System.out.print(stu[i][j]+" ");
//		}
	}
//	sc.close();

	public School() {  //생성자
//		this();
	}

	
	public void print() {
		System.out.print(student);
	}
	
}

public class Main {
	public static void main(String[] args) {

	}

}
