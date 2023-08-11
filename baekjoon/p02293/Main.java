package baekjoon.p02293;

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
        int[] dp = new int[k + 1];
        dp[0] = 1;

        for (int input : inputs) {
            for (int i = 1; i <= k; i++) {
                if (i >= input) {
                    dp[i] += dp[i - input];
                }
            }
        }

        return dp[k];
    }

}