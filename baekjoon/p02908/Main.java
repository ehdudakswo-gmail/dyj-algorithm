package baekjoon.p02908;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int a, int b) {
        return Math.max(rev(a), rev(b));
    }

    private static int rev(int n) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        String rev = sb.toString();
        return Integer.parseInt(rev);
    }

}