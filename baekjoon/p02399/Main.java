package baekjoon.p02399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] inputs = new long[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLong();
        }

        System.out.println(solve(inputs));
    }

    private static long solve(long[] inputs) {
        Arrays.sort(inputs);
        long ret = 0;
        int len = inputs.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                ret += (inputs[j] - inputs[i]);
            }
        }

        ret *= 2;
        return ret;
    }

}