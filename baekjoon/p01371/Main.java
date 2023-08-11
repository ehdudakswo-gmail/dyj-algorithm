package baekjoon.p01371;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }

            inputs.add(input);
        }

        System.out.println(solve(inputs));
    }

    private static String solve(List<String> inputs) {
        int[] cnt = new int[26];
        for (String input : inputs) {
            for (char ch : input.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    cnt[ch - 'a']++;
                }
            }
        }

        int max = -1;
        for (int n : cnt) {
            max = Math.max(max, n);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                sb.append((char) (i + 'a'));
            }
        }

        return sb.toString();
    }

}