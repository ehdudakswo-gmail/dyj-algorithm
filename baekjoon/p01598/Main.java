package baekjoon.p01598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solve(a, b));
    }

    private static int solve(int a, int b) {
        int ai = (a - 1);
        int ax = (ai / 4);
        int ay = (ai % 4);

        int bi = (b - 1);
        int bx = (bi / 4);
        int by = (bi % 4);

        int x = Math.abs(ax - bx);
        int y = Math.abs(ay - by);

        return (x + y);
    }
}