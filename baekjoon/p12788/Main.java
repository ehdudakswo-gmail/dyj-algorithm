package baekjoon.p12788;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] inputs = new int[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs, m, k));
    }

    private static String solve(int[] inputs, int m, int k) {
        List<Integer> list = new ArrayList<>(inputs.length);
        for (int e : inputs) {
            list.add(e);
        }
        Collections.sort(list);
        Collections.reverse(list);

        int target = m * k;
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (sum >= target) {
                return String.valueOf(i + 1);
            }
        }

        return "STRESS";
    }

}
