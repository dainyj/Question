package decimalFomat;
// 숫자 형식 클래스
//java.lang.Object
//	java.text.Format
//		java.text.NumberFormat
//			java.text.DecimalFormat

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		double num = 1234567.89;

		DecimalFormat df = new DecimalFormat("0"); //정수만
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0"); //소수점첫째자리까지 반올림
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000.00000"); // 비어있는 공간은 '0'으로
		System.out.println(df.format(num));

		df = new DecimalFormat("##########.#####"); // 비어있는 공간없이
		System.out.println(df.format(num));

		df = new DecimalFormat("#.0"); //소수첫째자리까지 반올림
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("#,###.0"); // , 표시
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0E0"); // 지수형식 E다음 반올림한 수
		System.out.println(df.format(num));

		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.# %"); // *100한 후 % 붙임
		System.out.println(df.format(num));

		df = new DecimalFormat("\u00A4 #.###"); //원화표시
		System.out.println(df.format(num));

	}

}
