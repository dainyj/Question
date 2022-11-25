package op_ex15;

public class OperatorEx15 {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32);
		System.out.println(upperCase);
	
		char c = '0';
		for (int i = 0; i < 75; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
	}

}
