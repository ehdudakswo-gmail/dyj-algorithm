package baekjoon.p10039;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 5;
        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input.add(sc.nextInt());
        }

        System.out.println(solve(input));
    }

    private static int solve(List<Integer> input) {
        int sum = 0;

        for (Integer value : input) {
            sum += Math.max(value, 40);
        }

        return (sum / input.size());
    }

}