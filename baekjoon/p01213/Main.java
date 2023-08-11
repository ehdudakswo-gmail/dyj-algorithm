package baekjoon.p01213;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        int[] cnt = new int[26];
        for (char ch : input.toCharArray()) {
            int idx = ch - 'A';
            cnt[idx]++;
        }

        List<Character> half = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            int n = cnt[i] / 2;
            char ch = (char) (i + 'A');
            for (int j = 0; j < n; j++) {
                half.add(ch);
            }
        }

        List<Character> center = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            char ch = (char) (i + 'A');
            if (cnt[i] % 2 == 1) {
                center.add(ch);
            }
        }

        List<Character> reverse = new ArrayList<>(half);
        Collections.reverse(reverse);

        List<Character> list = new ArrayList<>();
        list.addAll(half);
        list.addAll(center);
        list.addAll(reverse);

        StringBuilder sb = new StringBuilder();
        for (Character ch : list) {
            sb.append(ch);
        }

        String str = sb.toString();
        String rev = sb.reverse().toString();
        if (str.equals(rev)) {
            return str;
        } else {
            return "I'm Sorry Hansoo";
        }
    }

}