package if_Ex;
public class IfNestedExample {
	public static void main(String[] args) {
int score = 92;
		
		if (score >=90) {
			System.out.println("A");
				if (score >= 95) {
					System.out.println("+");
				} else {
					System.out.println("-");
				}
		} else {
			System.out.println("B");
			if (score >=80) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}

}
