package baekjoon.p10872;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        if (n <= 0) {
            return 1;
        }

        return n * solve(n - 1);
    }

}