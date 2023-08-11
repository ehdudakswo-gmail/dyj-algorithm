package baekjoon.p08932;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] inputs = new int[7];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }
            System.out.println(solve(inputs));
        }
    }

    private static int solve(int[] inputs) {
        String[] check = new String[]{"t", "f", "f", "t", "f", "f", "t"};
        double[][] set = new double[][]{
                {9.23076, 26.7, 1.835},
                {1.84523, 75, 1.348},
                {56.0211, 1.5, 1.05},
                {4.99087, 42.5, 1.81},
                {0.188807, 210, 1.41},
                {15.9803, 3.8, 1.04},
                {0.11193, 254, 1.88},
        };

        int sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (check[i].equals("t")) {
                sum += (set[i][0] * Math.pow(set[i][1] - inputs[i], set[i][2]));
            } else {
                sum += (set[i][0] * Math.pow(inputs[i] - set[i][1], set[i][2]));
            }
        }

        return sum;
    }

}