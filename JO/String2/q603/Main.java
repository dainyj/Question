package String2.q603;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
//		System.out.println(inp);
        sc.close();

        String[] arrInp = inp.split(" ");

        for (int i = 0; i < arrInp.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arrInp[i]);
            }
        }

//		case 2
        StringTokenizer st = new StringTokenizer(inp, " ");
        int num = 1;
        while (st.hasMoreTokens()) {
            String n = st.nextToken();
            if (num++ % 2 != 0) {
                System.out.println(n);
            }
        }
    }
}
