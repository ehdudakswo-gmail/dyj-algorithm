package baekjoon.p01026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[2][n];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(inputs[0], inputs[1]));
    }

    private static int solve(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int ret = 0;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            ret += (a[i] * b[len - 1 - i]);
        }

        return ret;
    }

}