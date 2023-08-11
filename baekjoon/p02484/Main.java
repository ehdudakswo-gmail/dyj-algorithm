package baekjoon.p02484;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][4];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        int ret = -1;

        for (int[] input : inputs) {
            ret = Math.max(ret, score(input));
        }

        return ret;
    }

    private static int score(int[] input) {
        int[] cnt = new int[7];
        for (int n : input) {
            cnt[n]++;
        }

        for (int i = 1; i <= 6; i++) {
            if (cnt[i] == 4) {
                return (50000 + i * 5000);
            } else if (cnt[i] == 3) {
                return (10000 + i * 1000);
            }
        }

        int[] cnt2 = find(cnt, 2);
        if (cnt2.length == 2) {
            return (2000 + cnt2[0] * 500 + cnt2[1] * 500);
        } else if (cnt2.length == 1) {
            return (1000 + cnt2[0] * 100);
        } else {
            return max(input) * 100;
        }
    }

    private static int[] find(int[] cnt, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            if (cnt[i] == target) {
                list.add(i);
            }
        }

        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }

        return ret;
    }

    private static int max(int[] input) {
        int ret = 0;

        for (int n : input) {
            ret = Math.max(ret, n);
        }

        return ret;
    }

}