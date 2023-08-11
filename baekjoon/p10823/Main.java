package baekjoon.p10823;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (sc.hasNextLine()) {
            inputs.add(sc.nextLine());
        }

        System.out.println(solve(inputs));
    }

    private static int solve(List<String> inputs) {
        String str = string(inputs);
        int[] arr = intArray(str.split(","));

        return sum(arr);
    }

    private static String string(List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String str : list) {
            sb.append(str);
        }

        return sb.toString();
    }

    private static int[] intArray(String[] arr) {
        int[] ret = new int[arr.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static int sum(int[] arr) {
        int ret = 0;

        for (int n : arr) {
            ret += n;
        }

        return ret;
    }

}