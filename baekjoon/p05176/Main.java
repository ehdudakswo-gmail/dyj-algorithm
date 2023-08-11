package baekjoon.p05176;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int p = sc.nextInt();
            int m = sc.nextInt();
            int[] inputs = new int[p];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static int solve(int[] inputs) {
        HashSet<Integer> hashSet = new HashSet<>();
        int ret = 0;

        for (int input : inputs) {
            if (hashSet.contains(input)) {
                ret++;
            } else {
                hashSet.add(input);
            }
        }

        return ret;
    }

}