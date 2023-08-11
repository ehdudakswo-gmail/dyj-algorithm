package baekjoon.p11047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs, k));
    }

    private static int solve(int[] inputs, int k) {
        int ret = 0;
        int remain = k;

        for (int i = inputs.length - 1; i >= 0; i--) {
            if (inputs[i] > k) {
                continue;
            }

            ret += (remain / inputs[i]);
            remain = (remain % inputs[i]);

            if (remain <= 0) {
                break;
            }
        }

        return ret;
    }

}