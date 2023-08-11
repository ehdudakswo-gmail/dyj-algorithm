package baekjoon.p10871;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int ret : solve(inputs, x)) {
            System.out.print(ret);
            System.out.print(" ");
        }
    }

    private static List<Integer> solve(int[] inputs, int x) {
        List<Integer> ret = new ArrayList<>();

        for (int input : inputs) {
            if (input < x) {
                ret.add(input);
            }
        }

        return ret;
    }

}