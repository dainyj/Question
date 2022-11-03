package operator;
import java.util.Scanner;

public class Operator_518 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		sc.close();
		
		int sum = i1 + i2 + i3;
//		int avg = sum / 3;  //정수만
		double avg = (double)sum / 3; //소수점자리까지 나오게
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.printf("avg : %.3f\n", avg);
		
		
	}
}
