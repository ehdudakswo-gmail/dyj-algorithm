package baekjoon.p05354;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static String solve(int n) {
        StringBuilder sb = new StringBuilder();
        String a = repeat("#", n);
        String b = "#" + repeat("J", n - 2) + "#";

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                sb.append(a);
                sb.append("\n");
            } else {
                sb.append(b);
                sb.append("\n");
            }
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