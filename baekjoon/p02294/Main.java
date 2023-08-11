package baekjoon.p02294;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs, k));
    }

    private static int solve(int[] inputs, int k) {
        final int INF = 987654321;
        int[] dp = new int[k + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int input : inputs) {
            for (int i = 1; i <= k; i++) {
                if (i >= input) {
                    dp[i] = Math.min(dp[i], dp[i - input] + 1);
                }
            }
        }

        if (dp[k] == INF) {
            return -1;
        }

        return dp[k];
    }

}