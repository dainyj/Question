public class PrintfEx1 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; //long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;
		
		int octNum = 010;      // 8진수 10, 10진수로는 8
		int hexNum = 0x10;    //16진수 10, 10진수로는 10
		int binNum = 0b10;     // 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d\n", b);
		System.out.printf("s=%d\n", s);
		System.out.printf("c=%c, %d\n", c, (int)c);
		System.out.printf("finger=[%5d]\n", finger);    //%숫자 오른쪽정렬 숫자자리
		System.out.printf("finger=[%-5d]\n", finger);   //%-숫자 왼쪽정렬 숫자자리
		System.out.printf("finger=[%05d]\n", finger);   //%0숫자 0으로 채운 오른쪽정렬 숫자자리
		System.out.printf("big=%d\n", big);
		System.out.printf("hex=%#x\n", hex);    //'#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d\n", octNum, octNum);   //%o는 8진수
		System.out.printf("hexNum=%x, %d\n", hexNum, hexNum);   //%x는 16진수
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(binNum), binNum);   //%s는 문자열		
	}
}
