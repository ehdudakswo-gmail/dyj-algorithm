package baekjoon.p11653;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> result = solve(n);
        for (Integer ret : result) {
            System.out.println(ret);
        }
    }

    private static List<Integer> solve(int n) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 2; (i * i) <= n; i++) {
            while (n % i == 0) {
                ret.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            ret.add(n);
        }

        return ret;
    }

}