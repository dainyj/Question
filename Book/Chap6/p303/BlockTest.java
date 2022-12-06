package p303;

public class BlockTest {
	static { // 클래스 생성과 동시에 메모리 할당받아 저장됨.
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest b1 = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest b2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		
		
	}

}
