package baekjoon.p01076;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[3];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        System.out.println(solve(inputs));
    }

    private static long solve(String[] inputs) {
        String[] set = {
                "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white",
        };

        int a = idx(set, inputs[0]);
        int b = idx(set, inputs[1]);
        int c = idx(set, inputs[2]);

        return (a * 10 + b) * (long) (Math.pow(10, c));
    }

    private static int idx(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return i;
            }
        }

        return -1;
    }

}