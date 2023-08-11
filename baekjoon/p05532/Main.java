package baekjoon.p05532;

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
        int l = inputs[0];
        int a = (inputs[1] + inputs[3] - 1) / inputs[3];
        int b = (inputs[2] + inputs[4] - 1) / inputs[4];

        return l - Math.max(a, b);
    }

}