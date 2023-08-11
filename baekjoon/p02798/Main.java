package baekjoon.p02798;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs, m));
    }

    private static int solve(int[] inputs, int m) {
        int len = inputs.length;
        int ret = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int sum = inputs[i] + inputs[j] + inputs[k];
                    if (sum <= m && sum > ret) {
                        ret = sum;
                    }
                }
            }
        }

        return ret;
    }

}