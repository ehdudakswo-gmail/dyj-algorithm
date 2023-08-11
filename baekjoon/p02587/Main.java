package baekjoon.p02587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[] inputs) {
        return new int[]{avg(inputs), mid(inputs)};
    }

    private static int avg(int[] inputs) {
        int sum = 0;

        for (int input : inputs) {
            sum += input;
        }

        return (sum / inputs.length);
    }

    private static int mid(int[] inputs) {
        Arrays.sort(inputs);
        return inputs[inputs.length / 2];
    }

}