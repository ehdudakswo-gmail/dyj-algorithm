package baekjoon.p01531;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[n][4];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(m, inputs));
    }

    private static int solve(int m, int[][] inputs) {
        int[][] arr = new int[101][101];
        for (int[] e : inputs) {
            inc(arr, e[0], e[1], e[2], e[3]);
        }

        int ret = 0;
        for (int[] e : arr) {
            for (int ee : e) {
                if (ee > m) {
                    ret++;
                }
            }
        }

        return ret;
    }

    private static void inc(int[][] arr, int y0, int x0, int y1, int x1) {
        for (int y = y0; y <= y1; y++) {
            for (int x = x0; x <= x1; x++) {
                arr[y][x]++;
            }
        }
    }

}