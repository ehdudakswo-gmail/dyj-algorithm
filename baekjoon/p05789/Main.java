package baekjoon.p05789;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String input) {
        int a = input.length() / 2 - 1;
        int b = a + 1;

        if (input.charAt(a) == input.charAt(b)) {
            return "Do-it";
        } else {
            return "Do-it-Not";
        }
    }

}