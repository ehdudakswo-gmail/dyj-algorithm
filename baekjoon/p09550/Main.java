package baekjoon.p09550;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] inputs = new int[n];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(k, inputs));
        }
    }

    private static int solve(int k, int[] inputs) {
        int ret = 0;

        for (int n : inputs) {
            ret += (n / k);
        }

        return ret;
    }

}