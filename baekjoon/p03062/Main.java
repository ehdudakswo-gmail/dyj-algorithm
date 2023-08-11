package baekjoon.p03062;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static String solve(int input) {
        if (sym(input + rev(input))) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static int rev(int n) {
        String str = String.valueOf(n);
        String rev = new StringBuilder(str).reverse().toString();

        return Integer.parseInt(rev);
    }

    private static boolean sym(int n) {
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

}