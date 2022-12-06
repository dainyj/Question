package arrayBinarySearch;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		int index = Arrays.binarySearch(scores, 99); 
		// 바이너리서치 하기전 반드시 오름차순정렬 필요, 내림차순X
		
		System.out.println("index : " + index);

	}

}
