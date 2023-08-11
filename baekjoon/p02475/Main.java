package baekjoon.p02475;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int ret = 0;

        for (int input : inputs) {
            ret += (Math.pow(input, 2));
        }

        ret %= 10;

        return ret;
    }

}