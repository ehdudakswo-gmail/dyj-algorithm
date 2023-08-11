package baekjoon.p02775;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }

    private static int solve(int k, int n) {
        int[][] arr = new int[k + 1][n + 1];

        int[] arr0 = arr[0];
        for (int i = 0; i < arr0.length; i++) {
            arr0[i] = i;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        return arr[k][n];
    }

}