package baekjoon.p09085;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] inputs = new int[n];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(sum(inputs));
        }
    }

    private static int sum(int[] inputs) {
        int ret = 0;

        for (int input : inputs) {
            ret += input;
        }

        return ret;
    }

}