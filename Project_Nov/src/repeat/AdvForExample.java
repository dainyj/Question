package repeat;

public class AdvForExample {
	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8 };

		int sum = 0;
		for (int s : scores) { // (타입변수 : 배열)
			sum += s;
		}

//		for (int s = 0; s <5; S++;) {  // (초기화식; 조건식; 증감식)
//			sum += scores[s];
//	}

		System.out.println("sum : " + sum);
	}

}
