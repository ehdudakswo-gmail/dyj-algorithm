package baekjoon.p11050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int n, int k) {
        int c = (k > n / 2) ? (n - k) : (k);
        return mul(n, c) / fac(c);
    }

    private static int mul(int n, int down) {
        int ret = 1;

        for (int i = n; i > n - down; i--) {
            ret *= i;
        }

        return ret;
    }

    private static int fac(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fac(n - 1);
    }

}