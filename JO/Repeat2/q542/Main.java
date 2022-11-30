package q542;

public class Main {
	public static void main(String[] args) {

//	1.
		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
//	2.
		int i = 10;
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i == 21) {
				break;
			}
		}
		System.out.println();
//	3.	
		int j = 10;
		do {
			System.out.print(j + " ");
			j++;
		} while (j >= 10 && j <= 20);

	}
}
