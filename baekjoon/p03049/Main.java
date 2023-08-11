package baekjoon.p03049;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        return (n * (n - 1) * (n - 2) * (n - 3)) / (4 * 3 * 2);
    }

}