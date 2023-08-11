package baekjoon.p05554;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[4];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[] inputs) {
        int sum = 0;
        for (int n : inputs) {
            sum += n;
        }

        return new int[]{
                sum / 60,
                sum % 60
        };
    }

}