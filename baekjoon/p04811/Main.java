package baekjoon.p04811;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            System.out.println(solve(n));
        }
    }

    private static long solve(int n) {
        return new P04811().solve(n);
    }

    private static class P04811 {
        private long[][] dp;

        long solve(int n) {
            this.dp = new long[n + 1][n + 1];
            return dfs(n, 0);
        }

        private long dfs(int w, int h) {
            if (w == 0 && h == 0) {
                return 1;
            }

            if (dp[w][h] > 0) {
                return dp[w][h];
            }

            if (w > 0) {
                dp[w][h] += dfs(w - 1, h + 1);
            }

            if (h > 0) {
                dp[w][h] += dfs(w, h - 1);
            }

            return dp[w][h];
        }

    }

}