package baekjoon.p10865;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[m][2];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
        }

        for (int solve : solve(n, inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int n, int[][] inputs) {
        int[] ret = new int[n];
        for (int[] input : inputs) {
            int a = input[0];
            int b = input[1];
            ret[a - 1]++;
            ret[b - 1]++;
        }

        return ret;
    }

}