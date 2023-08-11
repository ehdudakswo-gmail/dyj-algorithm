package baekjoon.p10950;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] inputs = new int[t][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        for (int ret : solve(inputs)) {
            System.out.println(ret);
        }
    }

    private static int[] solve(int[][] inputs) {
        int[] ret = new int[inputs.length];

        for (int i = 0; i < inputs.length; i++) {
            ret[i] = inputs[i][0] + inputs[i][1];
        }

        return ret;
    }

}