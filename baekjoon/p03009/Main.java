package baekjoon.p03009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int cnt = 3;

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            xList.add(sc.nextInt());
            yList.add(sc.nextInt());
        }

        System.out.println(solve(xList) + " " + solve(yList));
    }

    private static int solve(List<Integer> list) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (Integer key : list) {
            if (hashMap.containsKey(key)) {
                int value = hashMap.get(key);
                hashMap.put(key, value + 1);
            } else {
                hashMap.put(key, 1);
            }
        }

        for (Integer key : list) {
            if (hashMap.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

}