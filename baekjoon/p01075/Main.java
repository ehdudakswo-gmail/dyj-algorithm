package baekjoon.p01075;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int n, int f) {
        int nn = (n / 100) * 100;
        while (nn % f != 0) {
            nn++;
        }

        return String.format("%02d", nn % 100);
    }

}