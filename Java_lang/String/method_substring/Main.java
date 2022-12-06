package method_substring;

public class Main {
	public static void main(String[] args) {
		String ssn = "870913-1234567";

		String firstNum = ssn.substring(0, 6); //0번째부터 6글자
		String secondNum = ssn.substring(7); //7번째부터 뒤에 다 

		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);
	}

}
