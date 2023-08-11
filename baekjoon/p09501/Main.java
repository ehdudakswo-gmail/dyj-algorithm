package baekjoon.p09501;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[][] inputs = new int[n][3];

            for (int[] input : inputs) {
                input[0] = sc.nextInt();
                input[1] = sc.nextInt();
                input[2] = sc.nextInt();
            }

            System.out.println(solve(inputs, d));
        }
    }

    private static int solve(int[][] inputs, int d) {
        int ret = 0;

        for (int[] input : inputs) {
            if (input[0] * input[1] >= d * input[2]) {
                ret++;
            }
        }

        return ret;
    }

}