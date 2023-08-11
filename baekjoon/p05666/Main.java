package baekjoon.p05666;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }

    private static String solve(int h, int p) {
        return String.format("%.2f", (double) h / p);
    }

}