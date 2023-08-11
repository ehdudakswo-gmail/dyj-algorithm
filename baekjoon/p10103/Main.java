package baekjoon.p10103;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] inputs = new int[n][2];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
        }

        for (int num : solve(inputs)) {
            System.out.println(num);
        }
    }

    private static int[] solve(int[][] inputs) {
        int[] ret = new int[]{100, 100};

        for (int[] input : inputs) {
            if (input[0] < input[1]) {
                ret[0] -= input[1];
            } else if (input[0] > input[1]) {
                ret[1] -= input[0];
            }
        }

        return ret;
    }

}