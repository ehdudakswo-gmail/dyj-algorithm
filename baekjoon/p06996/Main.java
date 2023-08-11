package baekjoon.p06996;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next(), sc.next()));
        }
    }

    private static String solve(String a, String b) {
        int size = 26;
        int[] cntA = new int[size];
        int[] cntB = new int[size];

        for (char ch : a.toCharArray()) {
            int idx = ch - 'a';
            cntA[idx]++;
        }

        for (char ch : b.toCharArray()) {
            int idx = ch - 'a';
            cntB[idx]++;
        }

        for (int i = 0; i < size; i++) {
            if (cntA[i] != cntB[i]) {
                return String.format("%s & %s are NOT anagrams.", a, b);
            }
        }

        return String.format("%s & %s are anagrams.", a, b);
    }

}