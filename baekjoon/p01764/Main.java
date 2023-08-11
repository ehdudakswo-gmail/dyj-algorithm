package baekjoon.p01764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] inputs = new String[n + m];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        List<String> solves = solve(inputs);
        System.out.println(solves.size());
        for (String solve : solves) {
            System.out.println(solve);
        }
    }

    private static List<String> solve(String[] inputs) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String input : inputs) {
            if (hashMap.containsKey(input)) {
                hashMap.put(input, hashMap.get(input) + 1);
            } else {
                hashMap.put(input, 1);
            }
        }

        List<String> ret = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) >= 2) {
                ret.add(key);
            }
        }

        Collections.sort(ret);
        return ret;
    }

}