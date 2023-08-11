package baekjoon.p06131;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 0;
        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= a; b++) {
                if (a * a == b * b + n) {
                    ret++;
                }
            }
        }

        return ret;
    }

}