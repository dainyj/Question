package function2.q9092;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void sort(int[] inp) {

//  case1
//        for (int i = 0; i < inp.length - 1; i++) {
//            for (int j = 0; j < inp.length - 1; j++) {
//                if (inp[j] > inp[j + 1]) {
//                    int tmp = inp[j];
//                    inp[j] = inp[j + 1];
//                    inp[j + 1] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < inp.length; i++) {
//            System.out.print(inp[i] + " ");
//        }

//  case2
        Arrays.sort(inp);
//        for (int i = 0; i < inp.length; i++) {
//            System.out.print(inp[i] + " ");
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[6];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
//            System.out.print(inp[i] + " ");
        }
//        Main m = new Main();
//        m.sort(inp);
        sort(inp); //inp가 heap영역에 위치하고 있으므로 배열을 주소값을 가리키므로 출력이 가능
        
        for (int i = 0; i < inp.length; i++) {
            System.out.print(inp[i] + " ");
        }
    }
}
