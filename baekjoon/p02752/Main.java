package baekjoon.p02752;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[3];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[] inputs) {
        int[] ret = inputs.clone();
        Arrays.sort(ret);

        return ret;
    }

}