package baekjoon.p05543;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int[] list = Arrays.copyOfRange(inputs, 0, 3);
        int[] list2 = Arrays.copyOfRange(inputs, 3, 5);

        Arrays.sort(list);
        Arrays.sort(list2);

        return (list[0] + list2[0] - 50);
    }

}