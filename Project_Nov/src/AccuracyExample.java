public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
						
		double result1 = apple - number * pieceUnit;
		
		
		int totalPieces = apple * 10;
		int temp = totalPieces - number;
		
		double result2 = temp / 10.0;
				
		System.out.println(result1);
		System.out.println(result2);
	}
}
