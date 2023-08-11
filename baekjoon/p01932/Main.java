package baekjoon.p01932;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] inputs = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(n, inputs));
    }

    private static int solve(int n, int[][] inputs) {
        int[][] dp = new int[n + 1][n + 1];
        dp[1][1] = inputs[1][1];

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = inputs[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }

        int ret = 0;
        for (int i = 1; i <= n; i++) {
            ret = Math.max(ret, dp[n][i]);
        }

        return ret;
    }

}