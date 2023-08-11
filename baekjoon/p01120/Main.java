package baekjoon.p01120;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.next()));
    }

    private static int solve(String a, String b) {
        int ret = 987654321;
        for (int i = 0; i <= b.length() - a.length(); i++) {
            int diff = getDiff(a, b.substring(i, i + a.length()));
            ret = Math.min(ret, diff);
        }

        return ret;
    }

    private static int getDiff(String a, String b) {
        int ret = 0;
        int len = a.length();

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                ret++;
            }
        }

        return ret;
    }

}
