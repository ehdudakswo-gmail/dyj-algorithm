package baekjoon.p01085;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[4];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int[] arr = {
                inputs[0],
                inputs[2] - inputs[0],
                inputs[1],
                inputs[3] - inputs[1]
        };

        return min(arr);
    }

    private static int min(int[] arr) {
        int ret = arr[0];

        for (int n : arr) {
            ret = Math.min(ret, n);
        }

        return ret;
    }

}