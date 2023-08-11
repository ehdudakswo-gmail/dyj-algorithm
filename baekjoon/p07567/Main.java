package baekjoon.p07567;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solve(input));
    }

    private static int solve(String input) {
        int ret = 10;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                ret += 5;
            } else {
                ret += 10;
            }
        }

        return ret;
    }

}