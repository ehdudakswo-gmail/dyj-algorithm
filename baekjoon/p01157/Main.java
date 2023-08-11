package baekjoon.p01157;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        int[] cnt = new int[26];

        for (char ch : input.toUpperCase().toCharArray()) {
            int idx = ch - 'A';
            cnt[idx]++;
        }

        int max = max(cnt);
        List<Integer> idxs = idxs(cnt, max);

        if (idxs.size() == 1) {
            int idx = idxs.get(0);
            char ch = (char) (idx + 'A');
            return String.valueOf(ch);
        } else {
            return "?";
        }
    }

    private static int max(int[] cnt) {
        int ret = cnt[0];

        for (int n : cnt) {
            ret = Math.max(ret, n);
        }

        return ret;
    }

    private static List<Integer> idxs(int[] cnt, int max) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                ret.add(i);
            }
        }

        return ret;
    }

}