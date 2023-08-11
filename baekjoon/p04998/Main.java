package baekjoon.p04998;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(solve(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
    }

    private static int solve(double n, double b, double m) {
        int ret = 0;
        while (n < m) {
            n += (n * b * 0.01);
            ret++;
        }

        return ret;
    }

}