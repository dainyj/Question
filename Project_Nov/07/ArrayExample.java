
public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 87, 80, 65, 75, 90, 86, 95, 78, 67, 95, 54, 71, 79, 45, 98, 20, 90, 80, 60, 75, 94,
				81, 95, 67, 99, 84, 97 };
		for (int i = 0; i < scores.length; i++)
			System.out.println("scores[" + i + "] : " + scores[i]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; //
		}

		System.out.println("sum : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("avg : " + avg);

	}

}
