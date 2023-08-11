package baekjoon.p11022;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String format = "Case #%d: %d + %d = %d";

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = (a + b);

            String result = String.format(Locale.getDefault(), format, i, a, b, sum);
            System.out.println(result);
        }
    }

}