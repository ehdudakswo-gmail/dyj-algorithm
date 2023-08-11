package baekjoon.p11383;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] a = new String[n];
        String[] b = new String[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }

        System.out.println(solve(a, b));
    }

    private static String solve(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            if (!str2(a[i]).equals(b[i])) {
                return "Not Eyfa";
            }
        }

        return "Eyfa";
    }

    private static String str2(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (char ch : str.toCharArray()) {
            sb.append(ch);
            sb.append(ch);
        }

        return sb.toString();
    }

}