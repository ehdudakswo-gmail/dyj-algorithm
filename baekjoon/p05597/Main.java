package baekjoon.p05597;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[28];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int output : solve(inputs)) {
            System.out.println(output);
        }
    }

    private static List<Integer> solve(int[] inputs) {
        List<Integer> ret = new ArrayList<>();
        boolean[] check = new boolean[31];

        for (int input : inputs) {
            check[input] = true;
        }

        for (int i = 1; i < check.length; i++) {
            if (check[i]) {
                continue;
            }

            ret.add(i);
        }

        return ret;
    }

}