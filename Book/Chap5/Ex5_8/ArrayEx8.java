package Ex5_8;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;  //  ball[0]에 1을 저장(처음값을 0에서 1로 변경) 
		}
		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);

			temp = ball[i];     //swap
			ball[i] = ball[j];
			ball[j] = temp;

		}

		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
	}

}
