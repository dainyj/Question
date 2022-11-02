public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45     = " + (~45));
		
		int a = 8;
		int b = a >> 2;
		int c = a << 2;
		int d = a >>> 2;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
