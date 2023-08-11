package baekjoon.p01748;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i *= 10) {
            ret += (n - i + 1);
        }

        return ret;
    }

}