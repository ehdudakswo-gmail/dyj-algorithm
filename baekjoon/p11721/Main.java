package baekjoon.p11721;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String solve : solve(sc.next())) {
            System.out.println(solve);
        }
    }

    private static List<String> solve(String input) {
        List<String> ret = new ArrayList<>();

        for (int start = 0; start < input.length(); start += 10) {
            int end = Math.min(input.length(), start + 10);
            ret.add(input.substring(start, end));
        }

        return ret;
    }

}