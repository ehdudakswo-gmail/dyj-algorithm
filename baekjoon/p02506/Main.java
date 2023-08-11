package baekjoon.p02506;

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
        int ret = 0;
        int sum = 0;

        for (int input : inputs) {
            if (input == 1) {
                sum++;
                ret += sum;
            } else {
                sum = 0;
            }
        }

        return ret;
    }

}