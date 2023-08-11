package baekjoon.p11048;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[n][m];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(n, m, inputs));
    }

    private static int solve(int n, int m, int[][] inputs) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = inputs[i - 1][j - 1] + max(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]);
            }
        }

        return dp[n][m];
    }

    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

}