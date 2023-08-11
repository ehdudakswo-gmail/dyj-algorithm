package baekjoon.p10974;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }

        for (List<Integer> solve : new P10974(arr).solve()) {
            for (int e : solve) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    private static class P10974 {

        private int[] arr;
        private boolean[] used;
        private List<List<Integer>> ret = new ArrayList<>();

        P10974(int[] arr) {
            this.arr = arr;
            this.used = new boolean[arr.length];
        }

        List<List<Integer>> solve() {
            solve(new ArrayList<Integer>());
            return ret;
        }

        private void solve(List<Integer> list) {
            if (list.size() >= arr.length) {
                ret.add(list);
            }

            for (int i = 0; i < arr.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    List<Integer> newList = new ArrayList<>(list);
                    newList.add(arr[i]);
                    solve(newList);
                    used[i] = false;
                }
            }
        }

    }

}