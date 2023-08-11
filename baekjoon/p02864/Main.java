package baekjoon.p02864;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int solve : solve(sc.nextInt(), sc.nextInt())) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int a, int b) {
        return new int[]{
                convert(a, 6, 5) + convert(b, 6, 5),
                convert(a, 5, 6) + convert(b, 5, 6),
        };
    }

    private static int convert(int n, int from, int to) {
        StringBuilder sb = new StringBuilder();

        for (char ch : String.valueOf(n).toCharArray()) {
            if (ch == ('0' + from)) {
                sb.append(to);
            } else {
                sb.append(ch);
            }
        }

        return Integer.parseInt(sb.toString());
    }

}