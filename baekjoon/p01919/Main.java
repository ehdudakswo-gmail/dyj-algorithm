package baekjoon.p01919;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.next()));
    }

    private static int solve(String a, String b) {
        final int size = 26;
        int[] cntA = new int[size];
        int[] cntB = new int[size];

        for (char ch : a.toCharArray()) {
            cntA[ch - 'a']++;
        }

        for (char ch : b.toCharArray()) {
            cntB[ch - 'a']++;
        }

        int ret = 0;
        for (int i = 0; i < size; i++) {
            ret += Math.abs(cntA[i] - cntB[i]);
        }

        return ret;
    }

}
