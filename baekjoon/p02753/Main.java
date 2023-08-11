package baekjoon.p02753;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        if (n % 400 == 0) {
            return 1;
        }

        if (n % 4 == 0 && n % 100 != 0) {
            return 1;
        }

        return 0;
    }

}