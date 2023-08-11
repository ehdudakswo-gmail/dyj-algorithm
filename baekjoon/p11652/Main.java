package baekjoon.p11652;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] inputs = new long[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLong();
        }

        System.out.println(solve(inputs));
    }

    private static long solve(long[] inputs) {
        HashMap<Long, Integer> cnt = new HashMap<>();
        for (long e : inputs) {
            if (cnt.containsKey(e)) {
                cnt.put(e, cnt.get(e) + 1);
            } else {
                cnt.put(e, 1);
            }
        }

        List<Long> sortedKey = new ArrayList<>(cnt.keySet());
        Collections.sort(sortedKey);
        long max = sortedKey.get(0);

        for (long e : sortedKey) {
            if (cnt.get(e) > cnt.get(max)) {
                max = e;
            }
        }

        return max;
    }

}