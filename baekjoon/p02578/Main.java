package baekjoon.p02578;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        int[] b = new int[25];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(solve(a, b));
    }

    private static int solve(int[][] a, int[] b) {
        int check = -1;

        for (int i = 0; i < b.length; i++) {
            check(a, b[i], check);
            if (bingo(a, check) >= 3) {
                return i + 1;
            }
        }

        return -1;
    }

    private static void check(int[][] arr, int target, int check) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    arr[i][j] = check;
                    break;
                }
            }
        }
    }

    private static int bingo(int[][] arr, int check) {
        int ret = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (all(arr[i], check)) {
                ret++;
            }
        }

        for (int i = 0; i < len; i++) {
            int[] temp = new int[len];
            for (int j = 0; j < len; j++) {
                temp[j] = arr[j][i];
            }

            if (all(temp, check)) {
                ret++;
            }
        }

        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = arr[i][i];
        }

        int[] b = new int[len];
        for (int i = 0; i < len; i++) {
            b[i] = arr[i][len - i - 1];
        }

        if (all(a, check)) {
            ret++;
        }

        if (all(b, check)) {
            ret++;
        }

        return ret;
    }

    private static boolean all(int[] arr, int target) {
        for (int e : arr) {
            if (e != target) {
                return false;
            }
        }

        return true;
    }

}