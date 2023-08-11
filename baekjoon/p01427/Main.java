package baekjoon.p01427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        List<Integer> list = list(n);
        Collections.sort(list);
        Collections.reverse(list);

        return integer(list);
    }

    private static List<Integer> list(int n) {
        List<Integer> ret = new ArrayList<>();

        while (n != 0) {
            ret.add(n % 10);
            n /= 10;
        }

        return ret;
    }

    private static int integer(List<Integer> list) {
        int ret = 0;

        for (Integer n : list) {
            ret *= 10;
            ret += n;
        }

        return ret;
    }

}