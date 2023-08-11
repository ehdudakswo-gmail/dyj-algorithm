package baekjoon.p02851;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[10];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int n = inputs.length;
        int[] sum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + inputs[i - 1];
        }

        int target = 100;
        for (int i = 1; i <= n; i++) {
            if (sum[i] >= target) {
                int pre = sum[i - 1];
                int current = sum[i];

                if (target - pre < current - target) {
                    return pre;
                } else {
                    return current;
                }
            }
        }

        return sum[n];
    }

}