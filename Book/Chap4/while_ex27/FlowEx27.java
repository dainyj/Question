package while_ex27;
import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
		while(flag ) {
			System.out.printf(">>");
			
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum+=num;
			}else {
				flag =false;
			}
		}
		sc.close();
		System.out.println("합계:"+sum);
		
		
	}

}
