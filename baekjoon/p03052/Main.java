package baekjoon.p03052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[10];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int input : inputs) {
            hashSet.add(input % 42);
        }

        return hashSet.size();
    }

}