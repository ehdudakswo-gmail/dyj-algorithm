package baekjoon.p01822;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        List<Integer> solve = solve(a, b);
        System.out.println(solve.size());
        for (int e : solve) {
            System.out.print(e + " ");
        }
    }

    private static List<Integer> solve(int[] a, int[] b) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int e : a) {
            if (cnt.containsKey(e)) {
                cnt.put(e, cnt.get(e) + 1);
            } else {
                cnt.put(e, 1);
            }
        }

        for (int e : b) {
            if (cnt.containsKey(e)) {
                cnt.put(e, cnt.get(e) + 1);
            } else {
                cnt.put(e, 1);
            }
        }

        List<Integer> ret = new ArrayList<>();
        for (int e : a) {
            if (cnt.get(e) == 1) {
                ret.add(e);
            }
        }

        Collections.sort(ret);
        return ret;
    }

}