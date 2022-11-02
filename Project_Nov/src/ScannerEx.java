import java.util.Scanner;
// ctrl+shift+O 단축키

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
//		scanner.close(); 
		// 5번라인의 scanner의 warning 방지를 위한 code, scanner클래스는 사용 후 닫아줘야 안정적인 코드이다.
		
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d\n",num);
//		System.out.printf("num=%d%n",num);  //책에 나온 내용대로 작성				
	}
}
