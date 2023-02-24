package q9101;

public class Main {

	void method(int n) {
		if (n == 0) {// n=0일때 메서드 종료
			return;
		}
		System.out.println("홍길동");
		method(--n);// method(int n)호출
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.method(10);
	}
}
