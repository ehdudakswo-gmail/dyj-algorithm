package baekjoon.p10384;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            System.out.println(String.format("Case %d: %s", i, solve(input)));
        }
    }

    private static String solve(String input) {
        int[] cnt = new int[26];
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                cnt[ch - 'a']++;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int n : cnt) {
            min = Math.min(min, n);
        }

        switch (min) {
            case 0:
                return "Not a pangram";
            case 1:
                return "Pangram!";
            case 2:
                return "Double pangram!!";
            default:
                return "Triple pangram!!!";
        }
    }
}