package baekjoon.p06321;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("String #%d", i));
            System.out.println(solve(sc.next()));
            System.out.println();
        }
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        for (char ch : input.toCharArray()) {
            sb.append((char) ((ch - 'A' + 1) % 26 + 'A'));
        }

        return sb.toString();
    }

}