package baekjoon.p02739;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (String ret : solve(sc.nextInt())) {
            System.out.println(ret);
        }
    }

    private static String[] solve(int n) {
        String[] ret = new String[9];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = String.format(Locale.getDefault(),
                    "%d * %d = %d",
                    n,
                    (i + 1),
                    n * (i + 1)
            );
        }

        return ret;
    }

}