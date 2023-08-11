package baekjoon.p05618;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<Integer> solve(int[] inputs) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= gcd(inputs); i++) {
            if (cd(inputs, i)) {
                ret.add(i);
            }
        }

        return ret;
    }

    private static int gcd(int[] arr) {
        int ret = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            ret = gcd(arr[i], arr[i + 1]);
        }

        return ret;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    private static boolean cd(int[] arr, int n) {
        for (int e : arr) {
            if (e % n != 0) {
                return false;
            }
        }

        return true;
    }

}