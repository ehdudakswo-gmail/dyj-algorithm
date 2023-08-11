package baekjoon.p01158;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(string(solve(sc.nextInt(), sc.nextInt())));
    }

    private static List<Integer> solve(int n, int m) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        List<Integer> ret = new ArrayList<>();
        int idx = 0;
        while (list.size() > 0) {
            idx = (idx + m - 1) % list.size();
            ret.add(list.remove(idx));
        }

        return ret;
    }

    private static String string(List<Integer> list) {
        StringBuilder sb = new StringBuilder();

        sb.append("<");
        for (int e : list) {
            sb.append(e);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        return sb.toString();
    }

}