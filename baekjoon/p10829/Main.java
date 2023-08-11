package baekjoon.p10829;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(input);

        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }

}