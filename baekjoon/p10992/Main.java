package baekjoon.p10992;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static String solve(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(line(i, n));
            sb.append("\n");
        }

        return sb.toString();
    }

    private static String line(int i, int n) {
        StringBuilder sb = new StringBuilder();

        if (i == 1) {
            sb.append(repeat(" ", n - i));
            sb.append(repeat("*", 1));
        } else if (i == n) {
            sb.append(repeat("*", n * 2 - 1));
        } else {
            sb.append(repeat(" ", n - i));
            sb.append("*");
            sb.append(repeat(" ", (i - 1) * 2 - 1));
            sb.append("*");
        }

        return sb.toString();
    }

    private static String repeat(String str, int cnt) {
        StringBuilder sb = new StringBuilder();

        while (cnt-- > 0) {
            sb.append(str);
        }

        return sb.toString();
    }

}