package baekjoon.p02562;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[9];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int ret : solve(inputs)) {
            System.out.println(ret);
        }
    }

    private static int[] solve(int[] inputs) {
        int max = inputs[0];
        int idx = 0;

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] > max) {
                max = inputs[i];
                idx = i;
            }
        }

        return new int[]{max, idx + 1};
    }

}