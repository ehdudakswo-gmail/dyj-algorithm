package baekjoon.p10874;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][10];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<Integer> solve(int[][] inputs) {
        List<Integer> ret = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        for (int i = 0; i < inputs.length; i++) {
            if (same(inputs[i], arr)) {
                ret.add(i + 1);
            }
        }

        return ret;
    }

    private static boolean same(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

}