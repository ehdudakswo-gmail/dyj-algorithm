package baekjoon.p05576;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[20];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[] inputs) {
        int[] list = sub(inputs, 0, 9);
        int[] list2 = sub(inputs, 10, 19);

        Arrays.sort(list);
        Arrays.sort(list2);

        int[] max = sub(list, 7, 9);
        int[] max2 = sub(list2, 7, 9);

        return new int[]{sum(max), sum(max2)};
    }

    private static int[] sub(int[] arr, int from, int to) {
        List<Integer> list = new ArrayList<>();
        for (int i = from; i <= to; i++) {
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