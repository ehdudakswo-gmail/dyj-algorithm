package baekjoon.p05691;

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

            System.out.println(solve(a, b));
        }
    }

    private static int solve(int a, int b) {
        return a * 3 - (a + b);
    }

}