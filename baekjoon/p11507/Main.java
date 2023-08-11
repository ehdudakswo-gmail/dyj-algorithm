package baekjoon.p11507;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next().trim()));
    }

    private static String solve(String input) {
        int len = input.length() / 3;
        String[] inputs = new String[len];
        for (int i = 0; i < inputs.length; i++) {
            int idx = i * 3;
            inputs[i] = input.substring(idx, idx + 3);
        }

        int n = 26;
        int m = 13;
        int[][] check = new int[n][m + 1];
        for (String e : inputs) {
            int a = e.charAt(0) - 'A';
            int b = Integer.parseInt(e.substring(1));
            if (check[a][b] != 0) {
                return "GRESKA";
            }

            check[a][b] = 1;
        }

        StringBuilder sb = new StringBuilder();
        String str = "PKHT";
        for (char ch : str.toCharArray()) {
            int idx = ch - 'A';
            int sum = getSum(check[idx]);
            sb.append(m - sum);
            sb.append(" ");
        }

        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    private static int getSum(int[] arr) {
        int ret = 0;
        for (int e : arr) {
            ret += e;
        }

        return ret;
    }

}