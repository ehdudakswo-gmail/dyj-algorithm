package baekjoon.p11659;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[][] b = new int[m][2];
        for (int i = 0; i < b.length; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }

        for (int solve : solve(a, b)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[] a, int[][] b) {
        int n = a.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + a[i - 1];
        }

        int[] ret = new int[b.length];
        for (int i = 0; i < ret.length; i++) {
            int start = b[i][0];
            int end = b[i][1];
            ret[i] = sum[end] - sum[start - 1];
        }

        return ret;
    }

}
