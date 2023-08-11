package baekjoon.p11948;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[6];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int[] a = Arrays.copyOfRange(inputs, 0, 4);
        int[] b = Arrays.copyOfRange(inputs, 4, 6);

        Arrays.sort(a);
        Arrays.sort(b);

        return a[1] + a[2] + a[3] + b[1];
    }

}