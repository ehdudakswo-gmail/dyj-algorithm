package baekjoon.p02164;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int input) {
        List<Integer> list = list(input);

        while (list.size() > 1) {
            list.remove(0);
            list.add(list.remove(0));
        }

        return list.get(0);
    }

    private static List<Integer> list(int n) {
        List<Integer> ret = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            ret.add(i);
        }

        return ret;
    }

}