package baekjoon.p10769;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLine()));
    }

    private static String solve(String input) {
        int a = cnt(input, ":-)");
        int b = cnt(input, ":-(");

        if (a == 0 && b == 0) {
            return "none";
        } else if (a > b) {
            return "happy";
        } else if (a < b) {
            return "sad";
        } else {
            return "unsure";
        }
    }

    private static int cnt(String str, String target) {
        int ret = 0;
        int len = target.length();

        for (int i = 0; i < str.length() - len; i++) {
            if (str.substring(i, i + len).equals(target)) {
                ret++;
            }
        }

        return ret;
    }

}