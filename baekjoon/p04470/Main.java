package baekjoon.p04470;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inputs = new String[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(String[] inputs) {
        String[] ret = new String[inputs.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = String.format("%d. %s", i + 1, inputs[i]);
        }

        return ret;
    }

}