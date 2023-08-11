package baekjoon.p01269;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int bb = sc.nextInt();

        int[] a = new int[aa];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[bb];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(solve(a, b));
    }

    private static int solve(int[] a, int[] b) {
        return arr(a, b).size() + arr(b, a).size();
    }

    private static List<Integer> arr(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : b) {
            set.add(e);
        }

        List<Integer> ret = new ArrayList<>();
        for (int e : a) {
            if (!set.contains(e)) {
                ret.add(e);
            }
        }

        return ret;
    }

}