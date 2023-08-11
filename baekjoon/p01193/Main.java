package baekjoon.p01193;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static String solve(int x) {
        int cnt = 0;
        int i = 0;

        while (i < x) {
            i += (++cnt);
        }

        int diff = i - x;
        int a = diff + 1;
        int b = cnt - diff;

        if (cnt % 2 == 1) {
            return String.format("%d/%d", a, b);
        } else {
            return String.format("%d/%d", b, a);
        }
    }

}