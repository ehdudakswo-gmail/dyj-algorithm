package baekjoon.p12018;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        P12018[] inputs = new P12018[n];
        for (int i = 0; i < inputs.length; i++) {
            int p = sc.nextInt();
            int l = sc.nextInt();

            int[] arr = new int[p];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            inputs[i] = new P12018(p, l, arr);
        }

        System.out.println(solve(n, m, inputs));
    }

    private static int solve(int n, int m, P12018[] inputs) {
        int[] min = new int[n];
        for (int i = 0; i < min.length; i++) {
            min[i] = inputs[i].getMin();
        }

        Arrays.sort(min);
        int sum = 0;
        for (int i = 0; i < min.length; i++) {
            sum += min[i];
            if (sum > m) {
                return i;
            }
        }

        return n;
    }

    private static class P12018 {

        private int p;
        private int l;
        private int[] arr;

        P12018(int p, int l, int[] arr) {
            this.p = p;
            this.l = l;
            this.arr = arr;
        }

        int getMin() {
            if (p < l) {
                return 1;
            } else {
                Arrays.sort(arr);
                return arr[p - l];
            }
        }

    }

}