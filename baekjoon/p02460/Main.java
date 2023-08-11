package baekjoon.p02460;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[10][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        int cnt = 0;
        int max = 0;

        for (int[] input : inputs) {
            cnt -= input[0];
            cnt += input[1];
            max = Math.max(max, cnt);
        }

        return max;
    }

}