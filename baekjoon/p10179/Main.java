package baekjoon.p10179;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextDouble()));
        }
    }

    private static String solve(double input) {
        return String.format("$%.2f", input * 0.8);
    }

}