package baekjoon.p02979;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[][] inputs = new int[3][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(a, b, c, inputs));
    }

    private static int solve(int a, int b, int c, int[][] inputs) {
        int[] cnt = new int[101];
        for (int[] input : inputs) {
            fill(cnt, input);
        }

        int ret = 0;
        int[] set = {0, a, b, c};
        for (int n : cnt) {
            ret += (set[n] * n);
        }

        return ret;
    }

    private static void fill(int[] a, int[] b) {
        for (int i = b[0]; i < b[1]; i++) {
            a[i]++;
        }
    }

}