package p629;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = { "cat", "dog", "lion", "tiger" };

		Arrays.sort(strArr);//String 
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//대소문자 구분X
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); //역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));

	}

}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) { //instaceof로 변환가능한지 판단
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;

			return c1.compareTo(c2)*-1; //내림차순으로 바꾸기 위해 *-1을 해줌.
			// compareTo()를 바로 호출할 수 없으므로 먼저 Comparable로 형변환 해야한다.
			
		}
		return -1;
	}
}