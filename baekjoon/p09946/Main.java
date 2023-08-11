package baekjoon.p09946;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            String a = sc.next();
            String b = sc.next();

            if (a.equals("END")) {
                break;
            }

            System.out.println(String.format("Case %d: %s", i++, solve(a, b)));
        }
    }

    private static String solve(String a, String b) {
        int[] cntA = cnt(a);
        int[] cntB = cnt(b);

        for (int i = 0; i < cntA.length; i++) {
            if (cntA[i] != cntB[i]) {
                return "different";
            }
        }

        return "same";
    }

    private static int[] cnt(String str) {
        int[] ret = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ret[ch - 'a']++;
        }

        return ret;
    }

}