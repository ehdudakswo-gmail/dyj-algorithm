package baekjoon.p11944;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int n, int m) {
        StringBuilder sb = new StringBuilder();
        int repeat = n;

        while (repeat-- > 0) {
            sb.append(String.valueOf(n));
        }

        if (sb.length() > m) {
            return sb.substring(0, m);
        } else {
            return sb.toString();
        }
    }

}
