package baekjoon.p02161;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int solve : solve(sc.nextInt())) {
            System.out.print(solve + " ");
        }
    }

    private static List<Integer> solve(int input) {
        List<Integer> ret = new ArrayList<>();
        List<Integer> list = list(input);


        while (true) {
            ret.add(list.remove(0));
            if (list.size() == 0) {
                break;
            }

            list.add(list.remove(0));
        }

        return ret;
    }

    private static List<Integer> list(int n) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ret.add(i);
        }

        return ret;
    }

}