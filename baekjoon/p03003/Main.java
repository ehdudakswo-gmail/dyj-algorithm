package baekjoon.p03003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[6];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int output : solve(inputs)) {
            System.out.print(output + " ");
        }
    }

    private static int[] solve(int[] inputs) {
        int[] set = {1, 1, 2, 2, 2, 8};
        int[] ret = new int[set.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = set[i] - inputs[i];
        }

        return ret;
    }

}