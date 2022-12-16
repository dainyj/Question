
public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("똥");
			try {
				Thread.sleep(500);

			} catch (Exception e) {

			}
		}

	}

}
