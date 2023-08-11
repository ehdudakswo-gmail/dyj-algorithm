package baekjoon.p04592;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] inputs = new int[n];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            for (int solve : solve(inputs)) {
                System.out.print(solve + " ");
            }
            System.out.println("$");
        }
    }

    private static List<Integer> solve(int[] inputs) {
        List<Integer> ret = new ArrayList<>();
        int selected = -1;

        for (int input : inputs) {
            if (selected != input) {
                selected = input;
                ret.add(input);
            }
        }

        return ret;
    }

}