package q562_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
//			System.out.print(inp[i] + " ");

            if (i % 2 == 0) {
                sum1 += inp[i];
            } else {
                sum2 += inp[i];
            }
        }
        System.out.printf("sum : %d\n", sum2);
//		System.out.println(sum1);
        System.out.printf("avg : %.1f", (double) sum1 / (inp.length / 2));
        sc.close();
    }
}
