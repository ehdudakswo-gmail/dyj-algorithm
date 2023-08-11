package baekjoon.p05800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            int n = sc.nextInt();
            int[] inputs = new int[n];

            for (int j = 0; j < inputs.length; j++) {
                inputs[j] = sc.nextInt();
            }

            int[] solve = solve(inputs);
            String ret = String.format(
                    Locale.getDefault(),
                    "Class %d\nMax %d, Min %d, Largest gap %d",
                    i, solve[0], solve[1], solve[2]
            );

            System.out.println(ret);
        }
    }

    private static int[] solve(int[] inputs) {
        List<Integer> list = list(inputs);
        Collections.sort(list);
        Collections.reverse(list);

        List<Integer> list2 = list2(list);

        return new int[]{first(list), last(list), max(list2)};
    }

    private static List<Integer> list(int[] inputs) {
        List<Integer> ret = new ArrayList<>();

        for (int input : inputs) {
            ret.add(input);
        }

        return ret;
    }

    private static List<Integer> list2(List<Integer> list) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i) - list.get((i + 1));
            ret.add(diff);
        }

        return ret;
    }

    private static int first(List<Integer> list) {
        return list.get(0);
    }

    private static int last(List<Integer> list) {
        return list.get(list.size() - 1);
    }

    private static int max(List<Integer> list) {
        int ret = first(list);

        for (int n : list) {
            ret = Math.max(ret, n);
        }

        return ret;
    }

}