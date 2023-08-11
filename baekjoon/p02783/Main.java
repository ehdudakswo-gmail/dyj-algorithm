package baekjoon.p02783;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        int[][] inputs = new int[n + 1][2];
        inputs[0] = new int[]{x, y};

        for (int i = 1; i < inputs.length; i++) {
            inputs[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        System.out.println(solve(inputs));
    }

    private static String solve(int[][] inputs) {
        double[] arr = new double[inputs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((double) inputs[i][0] * 1000) / inputs[i][1];
        }

        double min = arr[0];
        for (double e : arr) {
            min = Math.min(min, e);
        }

        return String.format("%.2f", min);
    }

}