package baekjoon.p11005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int n, int d) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            char ch = ch(n % d);
            sb.append(ch);
            n /= d;
        }

        return sb.reverse().toString();
    }

    private static char ch(int n) {
        if (n < 10) {
            return (char) ('0' + n);
        } else {
            return (char) ('A' + (n - 10));
        }
    }

}