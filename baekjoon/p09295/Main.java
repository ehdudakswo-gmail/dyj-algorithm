package baekjoon.p09295;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] inputs = new int[t][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static String solve(int[][] inputs) {
        StringBuilder sb = new StringBuilder();
        String format = "Case %d: %d";

        for (int i = 0; i < inputs.length; i++) {
            String ret = String.format(
                    Locale.getDefault(),
                    format,
                    i + 1,
                    inputs[i][0] + inputs[i][1]
            );

            sb.append(ret);
            sb.append("\n");
        }

        return sb.toString();
    }

}