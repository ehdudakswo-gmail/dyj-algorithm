package baekjoon.p01292;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int a, int b) {
        return sum(list(), a, b);
    }

    private static int[] list() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }

        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }

        return ret;
    }

    private static int sum(int[] list, int a, int b) {
        int ret = 0;

        for (int i = a; i <= b; i++) {
            int idx = i - 1;
            ret += list[idx];
        }

        return ret;
    }

}