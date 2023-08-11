package baekjoon.p11945;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0 || m == 0) {
            return;
        }

        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(String[] inputs) {
        String[] ret = new String[inputs.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = new StringBuilder(inputs[i]).reverse().toString();
        }

        return ret;
    }

}