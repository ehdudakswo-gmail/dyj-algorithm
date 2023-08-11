package baekjoon.p11021;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String format = "Case #%d: %d";

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            String result = String.format(Locale.getDefault(), format, i + 1, a + b);
            System.out.println(result);
        }
    }

}