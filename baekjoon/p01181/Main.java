package baekjoon.p01181;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> inputs = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            inputs.add(sc.next());
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<String> solve(List<String> inputs) {
        List<String> ret = new ArrayList<>(new HashSet<>(inputs));
        Collections.sort(ret, new Comp());

        return ret;
    }

    private static class Comp implements Comparator<String> {

        @Override
        public int compare(String a, String b) {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        }

    }

}