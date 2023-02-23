package Beginner3.q1707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        System.out.println(inp);
        sc.close();
    }
}

// case T--------------------------------------
//public class Main {
//    public static enum Dir {
//        RIGHT, DOWN, LEFT, UP
//    };
//
//    public static int inp;
//    public static int x = 0, y = 0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        inp = sc.nextInt();
//        sc.close();
//        int[][] ar = new int[inp][inp];
//        int cnt = 1;
//        Dir dir = Dir.RIGHT;
//
//        // print array
////      for (int i = 0; i < ar.length; i++) {
////         for (int j = 0; j < ar[i].length; j++) {
////            System.out.print(ar[i][j] + " ");
////         }
////         System.out.println();
////      }
//
//        if (inp == 1) {
//            System.out.println(1);
//        } else {
//            while (cnt <= inp * inp) {
//                ar[y][x] = cnt++;
//
//                switch (dir) {
//                    case RIGHT:
//                        x++;
//                        if (x == inp - 1 || ar[y][x + 1] != 0)
//                            dir = Dir.DOWN;
//                        break;
//                    case DOWN:
//                        y++;
//                        if (y == inp - 1 || ar[y + 1][x] != 0)
//                            dir = Dir.LEFT;
//                        break;
//                    case LEFT:
//                        x--;
//                        if (x == 0 || ar[y][x - 1] != 0)
//                            dir = Dir.UP;
//                        break;
//                    case UP:
//                        y--;
//                        if (y == 0 || ar[y - 1][x] != 0)
//                            dir = Dir.RIGHT;
//                        break;
//                }
//            }
//
//            // print array
////      System.out.println("------------------");
//            for (int i = 0; i < ar.length; i++) {
//                for (int j = 0; j < ar[i].length; j++) {
//                    System.out.printf("%d ", ar[i][j]);
//                }
//                System.out.println();
//            }
//        }
//    }
//}

// case 2--------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        int c = 1;
//        int x = 0;
//        int y = 0;
//        while (c <= n * n) {
//            while (c <= n * n) {
//                arr[x][y] = c++;
//                y++;
//                if (y == n || arr[x][y] != 0) {
//                    x++;
//                    y--;
//                    break;
//                }
//            }
//            while (c <= n * n) {
//                arr[x][y] = c++;
//                x++;
//                if (x == n || arr[x][y] != 0) {
//                    y--;
//                    x--;
//                    break;
//                }
//            }
//
//            while (c <= n * n) {
//                arr[x][y] = c++;
//                y--;
//                if (y < 0 || arr[x][y] != 0) {
//                    y++;
//                    x--;
//                    break;
//                }
//            }
//            while (c <= n * n) {
//                arr[x][y] = c++;
//                x--;
//                if (arr[x][y] != 0) {
//                    x++;
//                    y++;
//                    break;
//                }
//            }
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//case 3 ----------------------------------------------
//public class Main {
//    static int[][] square;
//    static int num = 1;
//    static int n, lastNum;
//    static int x , y;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        sc.close();
//        square = new int[n][n];
//
//        for(int i = 0; i < square.length; i++) {
//            for (int j = 0; j < square[i].length; j++) {
//                square[i][j] = -1;
//            }
//            System.out.println();
//        }
//
//        x = 0;
//        y = 0;
//        for(int i = 0; i < (n / 2) + 1; i++){
//            turn();
//        }
//        print();
//    }
//
//    static void turn(){
//        right(x, y);
//        down(x, y);
//        left(x, y);
//        up(x, y);
//    }
//
//    static void print(){
////        System.out.println("————최종출력————");
//        for(int i = 0; i < square.length; i++) {
//            for (int j = 0; j < square[i].length; j++) {
//                System.out.print(square[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    static void right(int x, int y){
//        if(x == 0){
//            for(int j = y; j < square.length; j++){
//                square[x][j] = num++;
//                lastNum = square[x][j];
//                Main.x = x;
//                Main.y = j;
//            }
//        } else {
//            for(int j = y + 1; j < square.length; j++){
//                if(square[x][j] != -1){
//                    return;
//                }
//                square[x][j] = num++;
//                lastNum = square[x][j];
//                Main.x = x;
//                Main.y = j;
//            }
//        }
//    }
//
//    static void down(int x, int y){
//        for(int i = x + 1; i < square.length; i++){
//            if(square[i][y] != -1){
//                return;
//
//            }
//            square[i][y] = num++;
//            lastNum = square[i][y];
//            Main.x = i;
//            Main.y = y;
//        }
//    }
//
//    static void left(int x, int y){
//        for(int i = y - 1; i >= 0; i—){
//            if(square[x][i] != -1){
//                return;
//            }
//            square[x][i] = num++;
//            lastNum = square[x][i];
//            Main.x = x;
//            Main.y = i;
//        }
//    }
//
//    static void up(int x, int y){
//        for(int i = x - 1; i >= 0; i—){
//            if(square[i][y] != -1){
//                return;
//            }
//            square[i][y] = num++;
//            lastNum = square[i][y];
//            Main.x = i;
//            Main.y = y;
//        }
//    }
//}
