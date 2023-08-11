package baekjoon.p02857;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        List<Integer> solves = solve(inputs);
        if (solves.size() == 0) {
            System.out.println("HE GOT AWAY!");
        }

        for (int solve : solves) {
            System.out.print(solve + " ");
        }
    }

    private static List<Integer> solve(String[] inputs) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].contains("FBI")) {
                ret.add(i + 1);
            }
        }

        return ret;
    }

}