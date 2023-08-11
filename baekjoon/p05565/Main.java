package baekjoon.p05565;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[10];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int total = inputs[0];
        int sum = 0;

        for (int i = 1; i < inputs.length; i++) {
            sum += inputs[i];
        }

        return (total - sum);
    }

}