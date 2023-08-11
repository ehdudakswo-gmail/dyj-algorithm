package baekjoon.p02744;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();

        for (char ch : chars) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch - 'A' + 'a'));
            } else {
                sb.append((char) (ch - 'a' + 'A'));
            }
        }

        return sb.toString();
    }

}