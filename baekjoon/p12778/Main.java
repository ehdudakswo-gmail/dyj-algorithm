package baekjoon.p12778;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int m = sc.nextInt();
            String c = sc.next();
            String[] inputs = new String[m];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.next();
            }

            for (String solve : solve(c, inputs)) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static String[] solve(String c, String[] inputs) {
        String[] ret = new String[inputs.length];
        for (int i = 0; i < ret.length; i++) {
            if (c.equals("C")) {
                char ch = inputs[i].charAt(0);
                ret[i] = String.valueOf(1 + ch - 'A');
            } else {
                int n = Integer.parseInt(inputs[i]);
                ret[i] = String.valueOf((char) ('A' + n - 1));
            }
        }

        return ret;
    }

}