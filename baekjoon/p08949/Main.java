package baekjoon.p08949;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int a, int b) {
        List<Integer> revA = revList(a);
        List<Integer> revB = revList(b);

        List<Integer> sum = sum(revA, revB);
        Collections.reverse(sum);

        return string(sum);
    }

    private static List<Integer> revList(int n) {
        List<Integer> ret = new ArrayList<>();

        while (n > 0) {
            ret.add(n % 10);
            n /= 10;
        }

        return ret;
    }

    private static List<Integer> sum(List<Integer> a, List<Integer> b) {
        int max = Math.max(a.size(), b.size());
        int[] sums = new int[max];

        for (int i = 0; i < a.size(); i++) {
            sums[i] += a.get(i);
        }

        for (int i = 0; i < b.size(); i++) {
            sums[i] += b.get(i);
        }

        List<Integer> ret = new ArrayList<>(sums.length);
        for (int n : sums) {
            ret.add(n);
        }

        return ret;
    }

    private static String string(List<Integer> list) {
        StringBuilder sb = new StringBuilder();

        for (int n : list) {
            sb.append(n);
        }

        return sb.toString();
    }

}