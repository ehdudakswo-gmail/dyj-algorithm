package baekjoon.p03040;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[9];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            for (int j = i + 1; j < inputs.length; j++) {
                int[] list = except(inputs, i, j);
                if (sum(list) == 100) {
                    return list;
                }
            }
        }

        return new int[]{-1};
    }

    private static int[] except(int[] arr, int idx, int idx2) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == idx || i == idx2) {
                continue;
            }

            list.add(arr[i]);
        }

        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }

        return ret;
    }

    private static int sum(int[] arr) {
        int ret = 0;

        for (int n : arr) {
            ret += n;
        }

        return ret;
    }

}