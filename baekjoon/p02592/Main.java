package baekjoon.p02592;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[10];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[] inputs) {
        return new int[]{
                avg(inputs),
                maxCnt(inputs)
        };
    }

    private static int avg(int[] inputs) {
        int sum = 0;

        for (int input : inputs) {
            sum += input;
        }

        return (sum / inputs.length);
    }

    private static int maxCnt(int[] inputs) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int input : inputs) {
            if (hashMap.containsKey(input)) {
                int value = hashMap.get(input);
                hashMap.put(input, value + 1);
            } else {
                hashMap.put(input, 1);
            }
        }

        int maxValue = -1;
        int maxKey = -1;

        for (int key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        return maxKey;
    }

}