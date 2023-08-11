package baekjoon.p09584;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        List<String> solve = solve(str, inputs);
        System.out.println(solve.size());
        for (String e : solve) {
            System.out.println(e);
        }
    }

    private static List<String> solve(String str, String[] inputs) {
        List<String> ret = new ArrayList<>();
        for (String e : inputs) {
            if (check(str, e)) {
                ret.add(e);
            }
        }

        return ret;
    }

    private static boolean check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            char aa = a.charAt(i);
            char bb = b.charAt(i);
            if (aa != '*' && aa != bb) {
                return false;
            }
        }

        return true;
    }

}