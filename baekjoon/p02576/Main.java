package baekjoon.p02576;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[7];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int ret : solve(inputs)) {
            System.out.println(ret);
        }
    }

    private static int[] solve(int[] inputs) {
        List<Integer> odds = odds(inputs);

        if (odds.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(odds);

        int sum = sum(odds);
        int min = odds.get(0);

        return new int[]{sum, min};
    }

    private static List<Integer> odds(int[] inputs) {
        List<Integer> ret = new ArrayList<>();

        for (int input : inputs) {
            if (input % 2 == 1) {
                ret.add(input);
            }
        }

        return ret;
    }

    private static int sum(List<Integer> inputs) {
        int ret = 0;

        for (int input : inputs) {
            ret += input;
        }

        return ret;
    }

}