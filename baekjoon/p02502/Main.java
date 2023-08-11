package baekjoon.p02502;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int solve : solve(sc.nextInt(), sc.nextInt())) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int d, int k) {
        for (int a = 1; a <= k; a++) {
            for (int b = a; b <= k; b++) {
                if (dp(a, b, d) == k) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{};
    }

    private static int dp(int a, int b, int d) {
        int[] dp = new int[d + 1];
        dp[1] = a;
        dp[2] = b;

        for (int i = 3; i <= d; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[d];
    }

}