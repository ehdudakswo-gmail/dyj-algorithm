package baekjoon.p01546;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static String solve(int[] inputs) {
        double[] list = new double[inputs.length];
        int max = max(inputs);

        for (int i = 0; i < list.length; i++) {
            list[i] = ((double) inputs[i] / max) * 100;
        }

        return avg(list);
    }

    private static int max(int[] inputs) {
        int ret = inputs[0];

        for (int input : inputs) {
            ret = Math.max(ret, input);
        }

        return ret;
    }

    private static String avg(double[] list) {
        double sum = 0;

        for (double e : list) {
            sum += e;
        }

        return String.format(
                Locale.getDefault(),
                "%.2f",
                sum / list.length
        );
    }

}