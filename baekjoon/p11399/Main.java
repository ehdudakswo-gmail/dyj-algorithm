package baekjoon.p11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        Arrays.sort(inputs);
        int[] dp = new int[inputs.length];
        dp[0] = inputs[0];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] + inputs[i];
        }

        return sum(dp);
    }

    private static int sum(int[] dp) {
        int ret = 0;

        for (int n : dp) {
            ret += n;
        }

        return ret;
    }

}