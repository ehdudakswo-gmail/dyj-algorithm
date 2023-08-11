package baekjoon.p10818;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        int[] ret = solve(inputs);
        System.out.println(ret[0] + " " + ret[1]);
    }

    private static int[] solve(int[] inputs) {
        int min = inputs[0];
        int max = inputs[0];

        for (int input : inputs) {
            min = Math.min(min, input);
            max = Math.max(max, input);
        }

        return new int[]{min, max};
    }

}