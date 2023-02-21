package q1338;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("(" + i + j + ")");
//            }
//            System.out.println();
//        }
        //알파벳 배열 선언 추가
        char[] alph = new char[26];
        for (int i = 0; i<alph.length; i++) {
            alph[i] = (char)('A'+i);
            System.out.print(alph[i]);
        }


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(alph[i]);
            }
            System.out.println();
        }

    }
}
// case T-----------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int inp = sc.nextInt();
//        sc.close();
//
//        int[][] ar = new int[inp][inp];
//        for (int i = 0; i < inp; i++) {
//            for (int j = 0; j < inp; j++) {
//                ar[i][j] = 0;
//            }
//        }
//
////      // print
////      for (int i = 0; i < inp; i++) {
////         for (int j = 0; j < inp; j++) {
////            System.out.print(ar[i][j] + " ");
////         }
////         System.out.println();
////      }
//
//        int c = 65;
//        for (int i = 0; i < inp; i++) {
//            for (int j = i, k = inp - 1; j < inp; j++, k--) {
//                if (c == 91) {
//                    c = 65;
//                }
//                ar[j][k] = c++;
//            }
//        }
//
//        // print
//        for (int i = 0; i < inp; i++) {
//            for (int j = 0; j < inp; j++) {
//                if(ar[i][j] == 0) {
//                    System.out.print("  ");
//                }else {
//                    System.out.printf("%c ", (char) ar[i][j]);
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//--------------------------------------------------------------------


//case 1 ----------------------------------------------------------
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int height = in.nextInt();
//        in.close();
//
////      65(A) ~ 90(Z)
//        char[][] alphabet = new char[height][height];
//
//        char start = 'A';
//        for (int i = 0; i < alphabet.length; i++) {
//            int k = alphabet.length - 1;
//            for (int j = i; j < alphabet[i].length; j++) {
//                if (start > 'Z') {
//                    start = 'A';
//                }
//
//                alphabet[j][k--] = start++;
//            }
//        }
//
//        for (int i = 0; i < alphabet.length; i++) {
//            for (int j = 0; j < alphabet[i].length; j++) {
//                if (alphabet[i][j] == '\0') {
//                    System.out.print("  ");
//                } else {
//                    System.out.print(alphabet[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
// ------------------------------------------------------------------

//case 2 -----------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        sc.close();
//
//        int[] aph = new int[100*100];
//        int a = 65;
//        for (int i = 0; i < aph.length; i++) {
//            aph[i] = a++;
//            if (a == 91) {
//                a = 65;
//            }
////         System.out.print((char) aph[i] + " ");
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = N; j > i + 1; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0, k = i, l = N - 1; j < i + 1; j++, k += l, l--) {
//                System.out.print((char) aph[k] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
// -------------------------------------------------------------------------------

//case 3 -----------------------------------------------------------------------
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        char[][] ch = new char[n][n];
//        char c = 'A';
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                if (i == 0) {
//                    for (int k = 0; k < n - (j + 1); k++) {
//                        ch[j][k] = ' ';
//                    }
//                }
//                ch[j + i][n - (j + 1)] = c;
//                c++;
//                if (c > 'Z') {
//                    c = 'A';
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(ch[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//
//}
//--------------------------------------------------------------------------------

//case 4 -----------------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        sc.close();
//        char[] alph = new char[N*N];
//
//        for(int i = 0, j = 0; i < alph.length; i++) {
//            alph[i] = (char)(65 + j++);
//            if(j == 26) {
//                j =0;
//            }
////			System.out.print(alph[i] + " ");
//        }
//        for(int i= 0; i < N; i++) {
//            for(int j = N - 1, k = i, z = N - 1; j >= 0; j—) {
//                if(i >= j) {
//                    System.out.print(alph[k] + " ");
//                    k = k + z—;
//                } else {
//                    System.out.print(' ' + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//-------------------------------------------------------------------------------