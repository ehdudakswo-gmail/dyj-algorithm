package baekjoon.p03058;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] inputs = new int[7];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            for (int solve : solve(inputs)) {
                System.out.println(solve);
            }
        }
    }

    private static int[] solve(int[] inputs) {
        Arrays.sort(inputs);
        int[] list = list(inputs);

        return new int[]{sum(list), list[0]};
    }

    private static int[] list(int[] inputs) {
        List<Integer> list = new ArrayList<>();

        for (int input : inputs) {
            if (input % 2 == 0) {
                list.add(input);
            }
        }

        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }

        return ret;
    }

    private static int sum(int[] list) {
        int ret = 0;

        for (int n : list) {
            ret += n;
        }

        return ret;
    }

}