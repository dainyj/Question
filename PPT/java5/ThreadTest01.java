
public class ThreadTest01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 60; i++) {
			System.out.println("thread"+ i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}
