package baekjoon.p11655;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLine()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                int idx = (ch - 'a' + 13) % 26;
                sb.append((char) ('a' + idx));
            } else if (Character.isUpperCase(ch)) {
                int idx = (ch - 'A' + 13) % 26;
                sb.append((char) ('A' + idx));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}