package baekjoon.p04458;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();

        sb.append(input);
        sb.replace(0, 1, String.valueOf(input.charAt(0)).toUpperCase());

        return sb.toString();
    }

}