package baekjoon.p10988;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        int len = input.length();

        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                return 0;
            }
        }

        return 1;
    }

}