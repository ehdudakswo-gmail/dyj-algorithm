package baekjoon.p05598;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            char ch2 = (char) (ch - 3);
            if (ch2 >= 'A' && ch2 <= 'Z') {
                sb.append(ch2);
            } else {
                sb.append((char) (ch2 + 26));
            }
        }

        return sb.toString();
    }

}