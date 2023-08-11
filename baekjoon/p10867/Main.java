package baekjoon.p10867;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> inputs = new ArrayList<>(n);

        while (n-- > 0) {
            inputs.add(sc.nextInt());
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static List<Integer> solve(List<Integer> inputs) {
        List<Integer> ret = new ArrayList<>(new HashSet<>(inputs));
        Collections.sort(ret);

        return ret;
    }

}