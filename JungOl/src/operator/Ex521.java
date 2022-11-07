package operator;
import java.util.Scanner;

public class Ex521 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int res = num1++ * --num2;
		System.out.printf("%d ", num1);
		System.out.printf("%d ", num2);
		System.out.println(res);

	}

}
