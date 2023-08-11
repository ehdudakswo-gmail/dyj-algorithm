package baekjoon.p10174;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }

    private static String solve(String input) {
        String lower = input.toLowerCase();
        String rev = new StringBuilder(lower).reverse().toString();

        if (lower.equals(rev)) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
