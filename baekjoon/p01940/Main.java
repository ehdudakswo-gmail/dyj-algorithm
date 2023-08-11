package baekjoon.p01940;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] inputs = new int[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs, m));
    }

    private static int solve(int[] inputs, int m) {
        boolean[] check = new boolean[1000001];
        for (int n : inputs) {
            check[n] = true;
        }

        int ret = 0;
        int left = 0;
        int right = m;

        while (left < right) {
            if (check[left] && check[right]) {
                ret++;
            }
            left++;
            right--;
        }

        return ret;
    }

}