package baekjoon.p03036;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(int[] inputs) {
        int first = inputs[0];
        String[] ret = new String[inputs.length - 1];

        for (int i = 0; i < ret.length; i++) {
            int n = inputs[i + 1];
            int gcd = gcd(first, n);
            ret[i] = String.format("%d/%d", first / gcd, n / gcd);
        }

        return ret;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}