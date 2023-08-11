package baekjoon.p02822;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        List<Integer> solves = solve(inputs);
        System.out.println(sum(inputs, solves));

        for (int solve : solves) {
            System.out.print((solve + 1) + " ");
        }
    }

    private static List<Integer> solve(int[] inputs) {
        List<Integer> list = list(inputs);
        Collections.sort(list);
        Collections.reverse(list);

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hashSet.add(list.get(i));
        }

        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            if (hashSet.contains(inputs[i])) {
                ret.add(i);
            }
        }

        return ret;
    }

    private static List<Integer> list(int[] inputs) {
        List<Integer> ret = new ArrayList<>();

        for (int input : inputs) {
            ret.add(input);
        }

        return ret;
    }

    private static int sum(int[] inputs, List<Integer> idxs) {
        int ret = 0;

        for (int idx : idxs) {
            ret += inputs[idx];
        }

        return ret;
    }

}