package p268;

class Data {
	int x;
}

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();  // 지역변수 d, stk의 main영역 안에 Data d영역 생성, new Data를 했으므로 Heap영역에 메모리 할당받음.
		d.x = 10; // Heap영역에 10 저장.

		Data d2 = copy(d); 
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x=" + d2.x);
	}

	static Data copy(Data d) {
		Data tmp = new Data(); //지역변수 tmp, 
		tmp.x = d.x;
		return tmp; // tmp의 주소값을 넘겨준다.
	}

}
