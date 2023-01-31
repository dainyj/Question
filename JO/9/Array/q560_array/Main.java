package q560_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }
        sc.close();

        int min = 0;
        min = inp[0];

        for (int i = 0; i < inp.length; i++) {
            if (inp[i] < min) {
                min = inp[i];
            }
        }
        System.out.println(min);

    }

}
