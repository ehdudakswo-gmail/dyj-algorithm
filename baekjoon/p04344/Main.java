package baekjoon.p04344;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        while (c-- > 0) {
            int n = sc.nextInt();
            int[] inputs = new int[n];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[] inputs) {
        int sum = 0;
        for (int input : inputs) {
            sum += input;
        }

        double avg = (double) sum / inputs.length;
        int cnt = 0;
        for (int input : inputs) {
            if (input > avg) {
                cnt++;
            }
        }

        double percent = ((double) cnt / inputs.length) * 100;
        return String.format("%.3f%%", percent);
    }

}