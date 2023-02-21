package Array2.q9074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[10];
//        int[]count = { 0,}; //0으로 초기화
//        int[]num= { 1,}; // 0번만 1 나머지는?

        boolean b = true;
        do {
            int inp = sc.nextInt();
            if (1 > inp || inp > 10)
                b = false;
            else
                cnt[inp - 1]++;

            System.out.println(inp);
        } while (b);
        sc.close();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                System.out.println((i + 1) + " : " + cnt[i] + "개");
            }
        }

    }
}

//case 2--------------------------------------------------------------------------
//public class Main {
//    private int[] capitalNum;
//    private int[] count;
//    private Scanner in;
//
//    public Main() {
//        in = new Scanner(System.in);
//
//        capitalNum = new int[10];
//        for (int i = 0; i < capitalNum.length; i++) {
//            capitalNum[i] = i + 1;
//        }
//
//        count = new int[10];
//    }
//
//    public void howMany() {
//
//        for (;;) {
//            int number = in.nextInt();
//            if (number >= 1 && number <= 10) {
//                if (IntStream.of(capitalNum).anyMatch(x -> x == number)) {
//                    count[number - 1]++;
//                }
//
//            } else {
//                break;
//            }
//        }
//
//        printOut();
//    }
//
//    private void printOut() {
//
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] > 0) {
//                System.out.printf("%d : %d개", i + 1, count[i]);
//                System.out.println();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Main test = new Main();
//
//        test.howMany();
//    }
//}
//--------------------------------------------------------------------------

//case3------------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//     범위에 벗어나는 수가 나올때까지 arrayList 에 넣는다.
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        while (true) {
//            int N = sc.nextInt();
//            if (N < 1 || 10 < N) {
//                for (int i = 1; i <= 10; i++) {
//                    int count = 0;
//                    for (int j = 0; j < arrayList.size(); j++) {
//                        if (i == arrayList.get(j))
//                            count++;
//                    }
//                    if (count != 0)
//                        System.out.printf("%d : %d개\n", i, count);
//                }
//                break;
//            }
//            arrayList.add(N);
//        }
//    }
//}
//-------------------------------------------------------------------------
