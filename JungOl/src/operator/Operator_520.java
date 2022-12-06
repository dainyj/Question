package operator;
import java.util.Scanner;

public class Operator_520 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String input = scanner.nextLine();
//		int num = sc.nextInt();  //바로 int타입으로 변환
		scanner.close();
		
		int num = Integer.parseInt(input); //숫자타입으로 변환

		
		
		System.out.println(num++);
		System.out.println(++num);	
	}
}