package baekjoon.p10870;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(solve(sc.nextInt()));
        System.out.println(solve2(sc.nextInt()));
    }

    private static int solve(int n) {
        if (n <= 1) {
            return n;
        }

        return solve(n - 2) + solve(n - 1);
    }

    private static int solve2(int n) {
        if (n <= 1) {
            return n;
        }

        int[] ret = new int[n + 1];
        ret[0] = 0;
        ret[1] = 1;

        for (int i = 2; i <= n; i++) {
            ret[i] = ret[i - 2] + ret[i - 1];
        }

        return ret[n];
    }

}