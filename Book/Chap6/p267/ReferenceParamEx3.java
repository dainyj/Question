package p267;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };

		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum=" + sumArr(arr));
	}

	static void printArr(int[] arr) {
		System.out.print("[");

		for (int i : arr) {// 향상된 for문
			System.out.print(i);
			for(int j=0;j<1;j++) {
//				if() break;  마지막 , 를 없애는 방법을 생각해보자.
				System.out.print(",");
			}
		}
		System.out.println("]");

	}

	static int sumArr(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;

	}

	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
	} // sortArr(int[] arr)
}
