package baekjoon.p10409;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(t, inputs));
    }

    private static int solve(int t, int[] inputs) {
        int sum = 0;
        int len = inputs.length;

        for (int i = 0; i < len; i++) {
            sum += inputs[i];
            if (sum > t) {
                return i;
            }
        }

        return len;
    }

}