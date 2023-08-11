package baekjoon.p03076;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> solve = solve(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        for (String e : solve) {
            System.out.println(e);
        }
    }

    private static List<String> solve(int r, int c, int a, int b) {
        final String X = repeat("X", b);
        final String DOT = repeat(".", b);
        List<String> ret = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                    sb.append(X);
                } else {
                    sb.append(DOT);
                }
            }

            String line = sb.toString();
            for (int k = 0; k < a; k++) {
                ret.add(line);
            }
        }

        return ret;
    }

    private static String repeat(String str, int cnt) {
        StringBuilder sb = new StringBuilder();
        while (cnt-- > 0) {
            sb.append(str);
        }

        return sb.toString();
    }

}