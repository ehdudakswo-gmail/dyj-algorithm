package baekjoon.p09507;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static long solve(int n) {
        long[] dp = new long[68];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        if (n <= 3) {
            return dp[n];
        }

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 4] + dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

}