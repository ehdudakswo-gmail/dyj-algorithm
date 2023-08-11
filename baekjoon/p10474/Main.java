package baekjoon.p10474;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            for (String solve : solve(a, b)) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static String[] solve(int a, int b) {
        return new String[]{
                String.valueOf(a / b),
                String.valueOf(a % b),
                "/",
                String.valueOf(b)
        };
    }

}