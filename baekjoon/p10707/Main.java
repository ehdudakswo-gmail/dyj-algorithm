package baekjoon.p10707;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[]{
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()
        };

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int x = inputs[0] * inputs[4];
        int y = y(inputs);

        return Math.min(x, y);
    }

    private static int y(int[] inputs) {
        int diff = inputs[4] - inputs[2];
        if (diff < 0) {
            return inputs[1];
        } else {
            return (inputs[1] + inputs[3] * diff);
        }
    }

}