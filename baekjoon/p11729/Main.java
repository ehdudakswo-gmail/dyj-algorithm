package baekjoon.p11729;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P11729 solve = new P11729(sc.nextInt());

        System.out.println(solve.size());
        System.out.println(solve.string());
    }

    private static class P11729 {

        private int size = 0;
        private StringBuilder sb = new StringBuilder();

        P11729(int n) {
            solve(n, 1, 2, 3);
        }

        private void solve(int n, int from, int by, int to) {
            if (n <= 1) {
                size++;
                sb.append(from);
                sb.append(" ");
                sb.append(to);
                sb.append("\n");
            } else {
                solve(n - 1, from, to, by);
                solve(1, from, by, to);
                solve(n - 1, by, from, to);
            }
        }

        int size() {
            return size;
        }

        String string() {
            return sb.toString();
        }

    }

}