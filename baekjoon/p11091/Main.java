package baekjoon.p11091;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }

    private static String solve(String input) {
        boolean[] checks = new boolean[26];
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                checks[ch - 'a'] = true;
            }
        }

        List<Character> except = new ArrayList<>();
        for (int i = 0; i < checks.length; i++) {
            if (!checks[i]) {
                except.add((char) (i + 'a'));
            }
        }

        if (except.size() == 0) {
            return "pangram";
        } else {
            return String.format("missing %s", join(except));
        }
    }

    private static String join(List<Character> list) {
        StringBuilder sb = new StringBuilder();

        for (char ch : list) {
            sb.append(ch);
        }

        return sb.toString();
    }

}