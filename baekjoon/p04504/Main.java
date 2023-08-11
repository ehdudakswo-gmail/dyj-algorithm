package baekjoon.p04504;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }

            System.out.println(solve(n, input));
        }
    }

    private static String solve(int n, int input) {
        if (input % n == 0) {
            return String.format("%d is a multiple of %d.", input, n);
        } else {
            return String.format("%d is NOT a multiple of %d.", input, n);
        }
    }

}