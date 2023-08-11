package baekjoon.p11365;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }

            System.out.println(solve(input));
        }
    }

    private static String solve(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}