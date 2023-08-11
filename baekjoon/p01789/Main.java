package baekjoon.p01789;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        int n = solve(s);

        System.out.println(n);
    }

    private static int solve(long s) {
        int n = 0;

        for (int i = 1; i <= s; i++) {
            s -= i;
            n++;
        }

        return n;
    }

}