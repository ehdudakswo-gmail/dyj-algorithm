package baekjoon.p09437;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int p = sc.nextInt();

            for (int solve : solve(n, p)) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer> solve(int n, int p) {
        int[][] set = new int[n / 4][4];
        for (int i = 0; i < set.length; i++) {
            set[i][0] = (i * 2 + 1);
            set[i][1] = set[i][0] + 1;
            set[i][2] = n - set[i][0];
            set[i][3] = set[i][2] + 1;
        }

        return except(find(set, p), p);
    }

    private static int[] find(int[][] set, int target) {
        for (int[] arr : set) {
            if (contains(arr, target)) {
                return arr;
            }
        }

        return new int[]{-1, -1};
    }

    private static boolean contains(int[] arr, int target) {
        for (int n : arr) {
            if (n == target) {
                return true;
            }
        }

        return false;
    }

    private static List<Integer> except(int[] arr, int target) {
        List<Integer> ret = new ArrayList<>();
        for (int n : arr) {
            if (n != target) {
                ret.add(n);
            }
        }

        return ret;
    }

}