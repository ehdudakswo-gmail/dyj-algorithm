package baekjoon.p02455;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[4][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        int[] list = new int[inputs.length];
        int cnt = 0;

        for (int i = 0; i < list.length; i++) {
            cnt -= inputs[i][0];
            cnt += inputs[i][1];
            list[i] = cnt;
        }

        return max(list);
    }

    private static int max(int[] list) {
        int ret = list[0];

        for (int n : list) {
            ret = Math.max(ret, n);
        }

        return ret;
    }

}