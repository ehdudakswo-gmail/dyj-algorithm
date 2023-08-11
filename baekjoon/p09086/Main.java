package baekjoon.p09086;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String input) {
        return String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length() - 1));
    }

}