package baekjoon.p10178;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] inputs = new int[]{
                    sc.nextInt(),
                    sc.nextInt()
            };

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[] inputs) {
        return String.format(
                Locale.getDefault(),
                "You get %d piece(s) and your dad gets %d piece(s).",
                inputs[0] / inputs[1],
                inputs[0] % inputs[1]
        );
    }

}