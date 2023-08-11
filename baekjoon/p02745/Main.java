package baekjoon.p02745;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.nextInt()));
    }

    private static int solve(String n, int b) {
        return Integer.parseInt(n, b);
    }

}