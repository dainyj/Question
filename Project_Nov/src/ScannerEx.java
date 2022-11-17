
import java.util.Scanner; // scanner 사용을 위해 추가
// ctrl+shift+O 단축키, 아래 scanner변수 지정 후 사용

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		//nextLine(은 공백을 포함하여 문장전체 출력가능)은 scannner를 사용하여 문자열을 입력받는 method
//		String input = scanner.next();  //공백인식X
		int num = Integer.parseInt(input);
//		int num = scanner.nextInt(); //9열과 12열의 과정을 한번에 처리. 정수만 가능
//		double input = scanner.nextDouble(); //실수값 입력가능.
//		char input = scanner.next().charAt(0); //문자 하나만.
		
		scanner.close(); 
		// 5번라인의 scanner의 warning 방지를 위한 code, scanner클래스는 사용 후 닫아줘야 안정적인 코드이다.
	
		
		
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d\n",num);
//		System.out.printf("num=%d%n",num);  //책에 나온 내용대로 작성				
	}
}
