package baekjoon.p02535;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P02535[] inputs = new P02535[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = new P02535(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        for (P02535 solve : solve(inputs)) {
            System.out.println(solve.a + " " + solve.b);
        }
    }

    private static List<P02535> solve(P02535[] inputs) {
        Arrays.sort(inputs, new Comparator<P02535>() {
            @Override
            public int compare(P02535 a, P02535 b) {
                return b.score - a.score;
            }
        });

        List<P02535> ret = new ArrayList<>();
        for (P02535 e : inputs) {
            if (ret.size() < 2) {
                ret.add(e);
            } else if (!same(new int[]{ret.get(0).a, ret.get(1).a, e.a})) {
                ret.add(e);
                break;
            }
        }

        return ret;
    }

    private static boolean same(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static class P02535 {

        int a;
        int b;
        int score;

        P02535(int a, int b, int s) {
            this.a = a;
            this.b = b;
            this.score = s;
        }

    }

}