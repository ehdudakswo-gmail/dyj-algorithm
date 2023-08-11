package baekjoon.p03460;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            for (Integer solve : solve(sc.nextInt())) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer> solve(int n) {
        List<Integer> ret = new ArrayList<>();
        String revBinary = new StringBuilder(binary(n)).reverse().toString();
        int len = revBinary.length();

        for (int i = 0; i < len; i++) {
            if (revBinary.charAt(i) == '1') {
                ret.add(i);
            }
        }

        return ret;
    }

    private static String binary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }

}