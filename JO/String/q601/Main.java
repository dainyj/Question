package String.q601;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(inp);
        System.out.println(inp.length());
        int cnt = 0;
        do {
//7-0=7 7-1=6   0 1 2 3 4 5 6 //7 6 5 4 3 2 1
            for (int i = 0, j = inp.length() - i; i < inp.length() - 1; i++) {
                System.out.print(inp.length() - i);
                System.out.print(inp.charAt(inp.length() - i) + ": ");
                System.out.println(inp.length()-(i+j));
            }


            cnt++;
            System.out.println(cnt);
//            }

        } while (cnt == inp.length());
    }
}
