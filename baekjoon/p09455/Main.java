package baekjoon.p09455;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] inputs = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    inputs[i][j] = sc.nextInt();
                }
            }

            System.out.println(solve(inputs, n, m));
        }
    }

    private static int solve(int[][] arr, int n, int m) {
        int ret = 0;
        for (int x = 0; x < m; x++) {
            int cnt = 0;
            for (int y = n - 1; y >= 0; y--) {
                if (arr[y][x] == 1) {
                    ret += cnt;
                } else {
                    cnt++;
                }
            }
        }

        return ret;
    }

}