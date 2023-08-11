package baekjoon.p09325;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            int[][] inputs = new int[n][2];

            for (int[] input : inputs) {
                input[0] = sc.nextInt();
                input[1] = sc.nextInt();
            }

            System.out.println(solve(s, inputs));
        }
    }

    private static int solve(int s, int[][] inputs) {
        int ret = s;

        for (int[] input : inputs) {
            ret += (input[0] * input[1]);
        }

        return ret;
    }

}