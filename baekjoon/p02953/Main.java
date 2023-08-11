package baekjoon.p02953;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[5][4];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
            input[3] = sc.nextInt();
        }

        int[] solve = solve(inputs);
        System.out.print(solve[0]);
        System.out.print(" ");
        System.out.print(solve[1]);
    }

    private static int[] solve(int[][] inputs) {
        int[] sums = new int[inputs.length];

        for (int i = 0; i < sums.length; i++) {
            sums[i] = sum(inputs[i]);
        }

        int maxIdx = -1;
        int maxSum = -1;

        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                maxIdx = i;
            }
        }

        return new int[]{maxIdx + 1, maxSum};
    }

    private static int sum(int[] arr) {
        int ret = 0;

        for (int e : arr) {
            ret += e;
        }

        return ret;
    }

}