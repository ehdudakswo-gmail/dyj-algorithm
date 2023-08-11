package baekjoon.p05523;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[][] inputs) {
        int[] ret = new int[2];

        for (int[] input : inputs) {
            if (input[0] > input[1]) {
                ret[0]++;
            } else if (input[0] < input[1]) {
                ret[1]++;
            }
        }

        return ret;
    }

}
