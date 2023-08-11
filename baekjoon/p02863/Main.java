package baekjoon.p02863;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] inputs = new double[2][2];

        inputs[0][0] = sc.nextDouble();
        inputs[0][1] = sc.nextDouble();
        inputs[1][0] = sc.nextDouble();
        inputs[1][1] = sc.nextDouble();

        System.out.println(solve(inputs));
    }

    private static int solve(double[][] inputs) {
        double[] arr = new double[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (inputs[0][0] / inputs[1][0] + inputs[0][1] / inputs[1][1]);
            rotate(inputs);
        }

        double max = -1;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        return idx;
    }

    private static void rotate(double[][] arr) {
        double temp = arr[0][0];
        arr[0][0] = arr[1][0];
        arr[1][0] = arr[1][1];
        arr[1][1] = arr[0][1];
        arr[0][1] = temp;
    }

}