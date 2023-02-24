/*자연수를 입력받아 아래와 같은 사각형을 출력하는 프로그램을 작성하시오.
주어지는 수는 100이하의 자연수이다.(함수를 작성하시오.)
*/

package q172;

// 마무리 필요
import java.util.Scanner;

class Scan {

	public Scan() {
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		scan.close();
	}

	public int setInp() {
		return setInp();
	}
	
	public void print() {
		System.out.println();
	}
}

class Rac {
	private int inp;

	public int getInp() {
		return inp;
	}

	public Rac() {
		for (int i = 1; i <= getInp(); i++) {
			for (int j = 1; j <= getInp(); j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scan sc = new Scan();
		sc.print();
	}
}

//===================================================
//public class Main {
//	int inp = 0;
//
//	public void scan() {
//		Scanner sc = new Scanner(System.in);
//		inp = sc.nextInt();
//		sc.close();
////		System.out.println(inp);
//	}
//
//	public void print() {
//		for (int i = 1; i <= inp; i++) {
//			for (int j = 1; j <= inp; j++) {
//				System.out.print(i * j + " ");
//			}
//			System.out.println();
//		}
//	}
//
//	public static void main(String[] args) {
//		Main m = new Main();
//		m.scan();
//		m.print();
//	}
//}
