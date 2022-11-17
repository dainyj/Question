

public class MathrandomEx {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 99) + 1;
		System.out.println(num1);

		double num2 = Math.random();
		System.out.printf("%.2f", num2);

	}

}

//1. 1~99까지의 정수를 출력하는 프로그램을 작성하세요. num1
//2. 0.0~0.99까지의 실수를 출력하는 프로그램을 작성하세요.(소수점2자리) num2