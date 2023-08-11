package baekjoon.p11637;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] inputs = new int[n];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[] inputs) {
        int max = max(inputs);
        List<Integer> list = list(inputs, max);

        if (list.size() != 1) {
            return "no winner";
        }

        int idx = list.get(0);
        if (max > sum(inputs) / 2) {
            return String.format("majority winner %d", idx + 1);
        } else {
            return String.format("minority winner %d", idx + 1);
        }
    }

    private static int max(int[] inputs) {
        int ret = inputs[0];

        for (int n : inputs) {
            ret = Math.max(ret, n);
        }

        return ret;
    }

    private static List<Integer> list(int[] inputs, int target) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == target) {
                ret.add(i);
            }
        }

        return ret;
    }

    private static int sum(int[] inputs) {
        int ret = 0;

        for (int n : inputs) {
            ret += n;
        }

        return ret;
    }

}