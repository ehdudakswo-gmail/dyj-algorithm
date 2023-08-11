package baekjoon.p07600;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("#")) {
                break;
            }

            System.out.println(solve(input));
        }
    }

    private static int solve(String input) {
        String lower = input.toLowerCase();
        int[] cnt = new int[26];
        for (char ch : lower.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                cnt[ch - 'a']++;
            }
        }

        int ret = 0;
        for (int n : cnt) {
            if (n > 0) {
                ret++;
            }
        }

        return ret;
    }

}