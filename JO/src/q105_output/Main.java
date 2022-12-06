package q105_output;

public class Main {

	public static void main(String[] args) {
//		1.배열 이용
		String[] c = { "Seoul", "Pusan", "Incheon", "Daegu", "Gwangju" };
		String[] p = { "10,312,545", "3,567,910", "2,758,296", "2,511,676", "1,454,636" };
		String[] in = { "+91,375", "+5,868", "+64,888", "+17,230", "+29,774" };

		System.out.printf("%15s%15s%15s\n", c[0], p[0], in[0]);
		System.out.printf("%15s%15s%15s\n", c[1], p[1], in[1]);
		System.out.printf("%15s%15s%15s\n", c[2], p[2], in[2]);
		System.out.printf("%15s%15s%15s\n", c[3], p[3], in[3]);
		System.out.printf("%15s%15s%15s\n", c[4], p[4], in[4]);
		System.out.println("--------------------------------------------------");
		
		
//		2.배열 이용2		2차원배열도 이용가능

		String[] s = { "Seoul", "10,312,545", "+91,375", "Pusan", " 3,567,910", "+5,868", "Incheon", " 2,758,296",
				"+64,888", "Daegu", " 2,511,676", "+17,230", "Gwangju", " 1,454,636", "+29,774" };
		
		for(int i=0; i<s.length;i++) {
			if(i%3==0) {
				System.out.println();
			}
			System.out.printf("%15s",s[i]);
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		
		
//		3. 2차원 배열 이용
		String[][]city= {
				{"Seoul", "10,312,545","+91,375"},
				{"Pusan", "3,567,910", "+5,868"},
				{"Incheon", "2,758,296","+64,888"},
				{"Daegu", "2,511,676", "+17,230"},
				{"Gwangju", "1,454,636", "+29,774"}
		};
		for(int i=0;i<city.length;i++) {
			for(int j=0;j< city[i].length;j++) {
				if(j%3==0) {
					System.out.println();
				}
				System.out.printf("%15s", city[i][j]);
			}
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		
//		3.printf 이용
		System.out.printf("%15s%15s%15s\n", "Seoul", "10,312,545", "+91,375");
		System.out.printf("%15s%15s%15s\n", "Pusan", "3,567,910", "+5,868");
		System.out.printf("%15s%15s%15s\n", "Incheon", "2,758,296", "+64,888");
		System.out.printf("%15s%15s%15s\n", "Daegu", "2,511,676", "+17,230");
		System.out.printf("%15s%15s%15s", "Gwangju", "1,454,636", "+29,774");

}

}
