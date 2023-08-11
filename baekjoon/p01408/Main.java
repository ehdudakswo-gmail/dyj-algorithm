package baekjoon.p01408;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[2];

        for (int i = 0; i < inputs.length; i++) {
            String input = sc.next();
            String[] arr = input.split(":");

            inputs[i] += (Integer.parseInt(arr[0]) * 3600);
            inputs[i] += (Integer.parseInt(arr[1]) * 60);
            inputs[i] += (Integer.parseInt(arr[2]));
        }

        System.out.println(solve(inputs));
    }

    private static String solve(int[] inputs) {
        int diff = inputs[1] - inputs[0];

        if (diff < 0) {
            diff += (24 * 3600);
        }

        return String.format(
                Locale.getDefault(),
                "%02d:%02d:%02d",
                diff / 3600,
                (diff % 3600) / 60,
                (diff % 3600) % 60
        );
    }

}