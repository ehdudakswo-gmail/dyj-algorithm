package baekjoon.p11586;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }
        int k = sc.nextInt();

        for (String solve : solve(inputs, k)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(String[] inputs, int k) {
        switch (k) {
            case 1:
                return inputs;
            case 2:
                return reverseLeftRight(inputs);
            case 3:
                return reverseTopBottom(inputs);
            default:
                return new String[]{};
        }
    }

    private static String[] reverseLeftRight(String[] inputs) {
        String[] ret = new String[inputs.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = new StringBuilder(inputs[i]).reverse().toString();
        }

        return ret;
    }

    private static String[] reverseTopBottom(String[] inputs) {
        String[] ret = new String[inputs.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = inputs[ret.length - i - 1];
        }

        return ret;
    }

}