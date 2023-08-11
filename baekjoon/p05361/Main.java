package baekjoon.p05361;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] inputs = new int[5];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[] inputs) {
        double[] set = {
                350.34,
                230.90,
                190.55,
                125.30,
                180.90
        };

        double[] ret = new double[set.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = set[i] * inputs[i];
        }

        double sum = 0;
        for (double d : ret) {
            sum += d;
        }

        return String.format("$%.2f", sum);
    }

}