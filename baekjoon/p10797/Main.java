package baekjoon.p10797;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs, n));
    }

    private static int solve(int[] inputs, int n) {
        int ret = 0;

        for (int input : inputs) {
            if (input == n) {
                ret++;
            }
        }

        return ret;
    }

}