package threadEx;

public class BeepTask implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
