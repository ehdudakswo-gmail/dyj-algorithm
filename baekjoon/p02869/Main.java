package baekjoon.p02869;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int a, int b, int v) {
        int target = v - a;
        int div = a - b;

        return (int) Math.ceil((double) target / div) + 1;
    }

}