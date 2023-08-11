package baekjoon.p10807;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        System.out.println(solve(inputs, v));
    }

    private static int solve(int[] inputs, int v) {
        int ret = 0;

        for (int input : inputs) {
            if (input == v) {
                ret++;
            }
        }

        return ret;
    }

}