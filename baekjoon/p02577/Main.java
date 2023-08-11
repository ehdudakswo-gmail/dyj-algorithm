package baekjoon.p02577;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int solve : solve(sc.nextInt(), sc.nextInt(), sc.nextInt())) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int a, int b, int c) {
        int[] ret = new int[10];
        int mul = (a * b * c);

        while (mul != 0) {
            ret[mul % 10]++;
            mul /= 10;
        }

        return ret;
    }

}