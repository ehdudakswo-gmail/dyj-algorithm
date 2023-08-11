package baekjoon.p02495;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        while (n-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static int solve(int n) {
        String str = String.valueOf(n);
        int idx = 0;
        int max = 1;

        while (idx < str.length()) {
            int nextIdx = nextIdx(str, idx);
            max = Math.max(max, nextIdx - idx);
            idx = nextIdx;
        }

        return max;
    }

    private static int nextIdx(String str, int idx) {
        for (int i = idx + 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(idx)) {
                return i;
            }
        }

        return str.length();
    }

}