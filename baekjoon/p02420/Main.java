package baekjoon.p02420;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static long solve(int n, int m) {
        return Math.abs((long) n - m);
    }

}