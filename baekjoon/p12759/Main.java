package baekjoon.p12759;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[9][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(n, inputs));
    }

    private static int solve(int n, int[][] inputs) {
        int p = n;
        int[][] arr = new int[3][3];

        for (int[] e : inputs) {
            int y = e[0] - 1;
            int x = e[1] - 1;
            arr[y][x] = p;
            if (check(arr, p)) {
                return p;
            }
            p = (p % 2 + 1);
        }

        return 0;
    }

    private static boolean check(int[][] arr, int n) {
        for (int[] e : arr) {
            if (all(e, n)) {
                return true;
            }
        }

        for (int x = 0; x < arr[0].length; x++) {
            int[] temp = new int[arr.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i][x];
            }

            if (all(temp, n)) {
                return true;
            }
        }

        int[] a = new int[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i][i];
        }

        int[] b = new int[arr.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i][arr.length - i - 1];
        }

        if (all(a, n) || all(b, n)) {
            return true;
        }

        return false;
    }

    private static boolean all(int[] arr, int n) {
        for (int e : arr) {
            if (e != n) {
                return false;
            }
        }

        return true;
    }

}