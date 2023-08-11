package baekjoon.p10833;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        int ret = 0;

        for (int[] input : inputs) {
            ret += (input[1] % input[0]);
        }

        return ret;
    }

}