package baekjoon.p08892;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            String[] inputs = new String[k];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.next();
            }

            System.out.println(solve(inputs));
        }

    }

    private static String solve(String[] inputs) {
        int len = inputs.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }

                String str = inputs[i] + inputs[j];
                if (check(str)) {
                    return str;
                }
            }
        }

        return String.valueOf(0);
    }

    private static boolean check(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

}