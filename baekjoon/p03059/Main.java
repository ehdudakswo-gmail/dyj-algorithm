package baekjoon.p03059;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static int solve(String input) {
        boolean[] checks = new boolean[26];
        for (char ch : input.toCharArray()) {
            checks[ch - 'A'] = true;
        }

        int ret = 0;
        for (int i = 0; i < checks.length; i++) {
            if (!checks[i]) {
                ret += (i + 'A');
            }
        }

        return ret;
    }

}