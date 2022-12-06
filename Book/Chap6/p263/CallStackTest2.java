package p263;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(Stringp[ args)이 시작되었음");
		firstMethod();
		System.out.println("main(string[] args)기 끝났습니다.");
	}

	static void firstMethod() {
		System.out.println("firstMethod()가 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()이 끝났음.");

	}

	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}

}
