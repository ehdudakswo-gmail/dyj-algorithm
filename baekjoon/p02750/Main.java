package baekjoon.p02750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[] inputs) {
        int[] ret = inputs.clone();
        Arrays.sort(ret);

        return ret;
    }

}