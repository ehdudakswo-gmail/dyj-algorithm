package baekjoon.p01453;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[sc.nextInt()];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        return inputs.length - distinct(inputs).length;
    }

    private static Object[] distinct(int[] inputs) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int n : inputs) {
            hashSet.add(n);
        }

        return hashSet.toArray();
    }

}