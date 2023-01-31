package q563_array;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
//			System.out.print(inp[i] + " ");
        }
        sc.close();
        System.out.println();

        for (int i = 0; i < inp.length; i++) {
            int max = Integer.MIN_VALUE;
            int op = -1;
            for (int j = 0; j < inp.length; j++) {
                if (inp[j] > max) {
                    max = inp[j];
                    op = j;
                }
            }
            System.out.print(max + " ");
            inp[op] = -1;

            for (int j = 0; j < inp.length; j++) {
//				System.out.print(inp[j] + " ");
            }
//			System.out.println();
        }
    }
}
