package baekjoon.p07523;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            long solve = solve(sc.nextLong(), sc.nextLong());
            System.out.println(String.format(("Scenario #%d:\n%s\n"), i, solve));
        }
    }

    private static long solve(long n, long m) {
        return (n + m) * (m - n + 1) / 2;
    }

}