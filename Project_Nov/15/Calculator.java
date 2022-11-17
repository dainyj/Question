public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	void execute() {
		int result = plus(5, 9);
		System.out.println("result :" + result);
	}

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute();
	}

}
