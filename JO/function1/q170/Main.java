/*‘@’문자를 10개 출력하는 함수를 작성 한 후 함수를 세 번 호출하여 아래와 같이 출력하는 프로그램을 작성하시오.
*/
package q170;

class At {
	int n = 10;
	
	public void print(int n) {
		if (n == 0)
			return;

		System.out.print("@");
		print(--n);
	}
}

public class Main {
	public static void main(String[] args) {
		At a = new At();
		
		String[] str= {"first", "second", "third"};
		for(int i=0;i<3;i++) {
			System.out.println(str[i]);
			a.print(10);
			System.out.println();
		}
	} //
}
