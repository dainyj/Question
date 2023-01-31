package q563_array;

import java.util.Scanner;

//    버블소트 사용
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
//			System.out.print(inp[i] + " ");
        }
        sc.close();
        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inp.length; i++) {
            for (int j = 0; j < inp.length - 1; j++) {

                if (inp[j] < inp[j + 1]) {
                    int tmp = inp[j];
                    inp[j] = inp[j + 1];
                    inp[j + 1] = tmp;

                }
//				System.out.println();
            }
            System.out.print(inp[i] + " ");

        }
    }

}
