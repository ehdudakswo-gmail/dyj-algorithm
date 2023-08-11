package baekjoon.p02605;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static List<Integer> solve(int[] inputs) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            int idx = ret.size() - inputs[i];
            ret.add(idx, i + 1);
        }

        return ret;
    }

}
