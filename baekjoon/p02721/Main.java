package baekjoon.p02721;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static int solve(int n) {
        int ret = 0;

        for (int i = 1; i <= n; i++) {
            ret += (i * T(i + 1));
        }

        return ret;
    }

    private static int T(int n) {
        return (n * (n + 1)) / 2;
    }

}
