package operator_Ex;
public class OperatorExample3 {
	public static void main(String[] args) {
		short s = 100;
		
//		short result = -s;
//		-를 붙이면 int타입으로 자동변환되어서 short타입에 넣을 수 없다. (int 4, short 2)
//		compile error
		
		int result2 = -s;
		
		System.out.println(s);
		System.out.println(result2);
	}
}
