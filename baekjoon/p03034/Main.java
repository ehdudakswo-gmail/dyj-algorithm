package baekjoon.p03034;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] inputs = new int[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (String solve : solve(w, h, inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(int w, int h, int[] inputs) {
        int max = (int) (Math.sqrt(w * w + h * h));
        String[] ret = new String[inputs.length];

        for (int i = 0; i < ret.length; i++) {
            if (inputs[i] <= max) {
                ret[i] = "DA";
            } else {
                ret[i] = "NE";
            }
        }

        return ret;
    }

}