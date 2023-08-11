package baekjoon.p10864;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[m][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(n, inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int n, int[][] inputs) {
        int[] ret = new int[n];

        for (int[] input : inputs) {
            ret[input[0] - 1]++;
            ret[input[1] - 1]++;
        }

        return ret;
    }

}