package baekjoon.p06603;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int k = sc.nextInt();
            if (k == 0) {
                break;
            }

            int[] inputs = new int[k];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            for (List<Integer> solve : solve(inputs)) {
                for (int e : solve) {
                    System.out.print(e + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> solve(int[] inputs) {
        return new Combination(inputs, 6).get();
    }

    private static class Combination {

        private List<List<Integer>> ret = new ArrayList<>();
        private int[] arr;
        private int n;
        private int r;

        Combination(int[] arr, int r) {
            this.arr = arr;
            this.n = arr.length;
            this.r = r;
        }

        List<List<Integer>> get() {
            dfs(new ArrayList<Integer>(), 0);

            return ret;
        }

        private void dfs(List<Integer> list, int start) {
            if (list.size() == r) {
                ret.add(list);
                return;
            }

            for (int i = start; i < n; i++) {
                List<Integer> copy = new ArrayList<>(list);
                copy.add(arr[i]);
                dfs(copy, i + 1);
            }
        }

    }

}