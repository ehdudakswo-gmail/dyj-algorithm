package baekjoon.P10996;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static String solve(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(pattern(n, "*", " "));
            sb.append("\n");
            sb.append(pattern(n, " ", "*"));
            sb.append("\n");
        }

        return sb.toString();
    }

    private static String pattern(int n, String a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
        }

        return sb.toString();
    }
}