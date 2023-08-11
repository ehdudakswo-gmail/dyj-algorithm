package baekjoon.p05426;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String input) {
        int len = (int) Math.sqrt(input.length());
        char[][] a = new char[len][len];
        char[][] b = new char[len][len];

        int idx = 0;
        for (int i = 0; i < input.length(); i += len) {
            a[idx++] = input.substring(i, i + len).toCharArray();
        }

        for (int i = 0; i < len; i++) {
            char[] arr = new char[len];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = a[j][len - i - 1];
            }
            b[i] = arr;
        }

        StringBuilder sb = new StringBuilder();
        for (char[] e : b) {
            sb.append(e);
        }

        return sb.toString();
    }

}