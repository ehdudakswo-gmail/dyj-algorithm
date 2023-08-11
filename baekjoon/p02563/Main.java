package baekjoon.p02563;

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

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        boolean[][] arr = new boolean[100][100];
        int len = 10;

        for (int[] e : inputs) {
            int x = e[0];
            int y = e[1];
            for (int i = y; i < y + len; i++) {
                for (int j = x; j < x + len; j++) {
                    arr[j][i] = true;
                }
            }
        }

        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) {
                    ret++;
                }
            }
        }

        return ret;
    }

}