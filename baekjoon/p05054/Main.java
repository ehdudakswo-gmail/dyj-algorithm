package baekjoon.p05054;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] inputs = new int[n];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static int solve(int[] inputs) {
        Arrays.sort(inputs);
        return (inputs[inputs.length - 1] - inputs[0]) * 2;
    }

}