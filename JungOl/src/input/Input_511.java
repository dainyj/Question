package input;
	import java.util.Scanner;
public class Input_511 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
					
		int result1 = i1 - i2;
		System.out.print(i1);
		System.out.print(" - " +i2);
		System.out.println(" = " + result1);
			
		int i3 = sc.nextInt();
		int i4 = sc.nextInt();

		sc.close();
			
		int result2 = i3 - i4;
		System.out.print(i3);
		System.out.print(" - " +i4);
		System.out.println(" = " + result2);			
	}
}

