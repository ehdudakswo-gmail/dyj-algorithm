package baekjoon.p09093;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        String[] inputs = input.split(" ");

        for (String str : inputs) {
            sb.append(reverse(str));
            sb.append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }

    private static String reverse(String str) {
        char[] arr = new char[str.length()];
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            arr[i] = str.charAt(len - i - 1);
        }

        return new String(arr);
    }

}