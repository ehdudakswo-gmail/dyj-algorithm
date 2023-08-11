package baekjoon.p09076;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] inputs = new int[5];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[] inputs) {
        Arrays.sort(inputs);

        if (inputs[3] - inputs[1] >= 4) {
            return "KIN";
        } else {
            int sum = inputs[1] + inputs[2] + inputs[3];
            return String.valueOf(sum);
        }
    }

}