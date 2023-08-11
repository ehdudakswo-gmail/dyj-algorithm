package baekjoon.p02720;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            for (int solve : solve(sc.nextInt())) {
                System.out.print(solve + " ");
            }

            System.out.println();
        }
    }

    private static int[] solve(int input) {
        int n = input;
        int[] sets = {25, 10, 5, 1};
        int[] ret = new int[sets.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = (n / sets[i]);
            n %= sets[i];
        }

        return ret;
    }

}