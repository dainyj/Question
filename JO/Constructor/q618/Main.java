/*5명의 이름과 키, 몸무게를 입력받아 이름순으로 정렬하여 출력하고, 
몸무게가 무거운 순으로 정렬하여 출력하는 프로그램을 작성하시오. 
몸무게는 소수점이하 1자리까지 출력한다.
입력
Lee 150 35.6
Kim 155 28.9
Sin 148 32.7
Jung 160 41.2
Park 165 38.7
 */

package q618;

import java.util.Scanner;

class Person {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

}

class Line {
	Scanner sc = new Scanner(System.in);

	private Person[] p = new Person[5];

	public Line() {// 이름, 키, 몸무게 배열
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			p[i] = new Person(name, height, weight);
		}
		sc.close();
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

// 이름순 정렬	첫글자가 A부터 
	public void lineName() {
		char[] narr = new char[p.length];
		for (int i = 0; i < p.length; i++) {
			narr[i] = p[i].getName().charAt(0);
//			System.out.println(narr[i]);
		}

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length - 1; j++) {
				if (narr[j] > narr[j + 1]) {
					char tmp = narr[j];
					narr[j] = narr[j + 1];
					narr[j + 1] = tmp;
				}
			}
		}

//		System.out.println();
//		for (int i = 0; i < p.length; i++) {
//			System.out.print(narr[i] + " ");
//		}
//		System.out.println();

		for (int i = 0; i < p.length; i++) {// 첫글자가 같은 경우에 대해 추가 계산이 필요
			for (int j = 0; j < p.length; j++)
				if (narr[i] == p[j].getName().charAt(0)) {
					p[j].print();
				}
		}
	}//

//	몸무게 무거운순 정렬 ..  wmax 배열하나 생성해서 max순서대로 넣기, wmax와 비교해서 출력 
	public void lineWeight() {
		double[] warr = new double[p.length];
		for (int i = 0; i < p.length; i++) {
			warr[i] = p[i].getWeight();
//			System.out.print(warr[i] + " ");
		}
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length - 1; j++) {
				if (warr[j] < warr[j + 1]) {
					double tmp = warr[j];
					warr[j] = warr[j + 1];
					warr[j + 1] = tmp;
				}
			}
		}
//		System.out.println();
//		for (int i = 0; i < p.length; i++) {
//			System.out.print(warr[i] + " ");
//		}
//		System.out.println();

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++)
				if (warr[i] == p[j].getWeight()) {
					p[j].print();
				}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Line line = new Line();
		System.out.println("name");
		line.lineName();
		System.out.println();
		System.out.println("weight");
		line.lineWeight();
	}
}
