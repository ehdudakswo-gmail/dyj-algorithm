package baekjoon.p10810;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[m][3];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
        }

        for (int solve : solve(n, inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int n, int[][] inputs) {
        int[] ret = new int[n];
        for (int[] input : inputs) {
            Arrays.fill(ret, input[0] - 1, input[1], input[2]);
        }

        return ret;
    }

}