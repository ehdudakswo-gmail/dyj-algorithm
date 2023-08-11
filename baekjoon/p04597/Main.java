package baekjoon.p04597;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.next();
            if (input.equals("#")) {
                break;
            }

            System.out.println(solve(input));
        }
    }

    private static String solve(String input) {
        int[] cnt = new int[2];
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = 0; i < input.length() - 1; i++) {
            cnt[input.charAt(i) - '0']++;
            sb.append(input.charAt(i));
        }

        char check = input.charAt(input.length() - 1);
        sb.append(last(check, cnt));

        return sb.toString();
    }

    private static char last(char check, int[] cnt) {
        switch (check) {
            case 'e':
                return (char) ('0' + cnt[1] % 2);
            case 'o':
                return (char) ('1' - cnt[1] % 2);
            default:
                return '?';
        }
    }

}