package baekjoon.p01731;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        if (inputs[0] + inputs[2] == inputs[1] * 2) {
            int last = inputs[inputs.length - 1];
            int diff = inputs[1] - inputs[0];
            return (last + diff);
        } else {
            int last = inputs[inputs.length - 1];
            int diff = inputs[1] / inputs[0];
            return (last * diff);
        }
    }

}