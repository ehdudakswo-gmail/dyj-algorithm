package baekjoon.p10156;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int k, int n, int m) {
        return Math.max(k * n - m, 0);
    }

}