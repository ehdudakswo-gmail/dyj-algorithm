package baekjoon.p11094;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputs = new String[n];

        sc.nextLine();
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<String> solve(String[] inputs) {
        final String target = "Simon says";
        List<String> ret = new ArrayList<>();

        for (String e : inputs) {
            if (e.contains(target)) {
                ret.add(e.replace(target, ""));
            }
        }

        return ret;
    }

}