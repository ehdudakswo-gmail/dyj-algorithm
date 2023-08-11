package baekjoon.p10773;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[sc.nextInt()];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        List<Integer> list = new ArrayList<>();

        for (int input : inputs) {
            if (input == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(input);
            }
        }

        return sum(list);
    }

    private static int sum(List<Integer> list) {
        int ret = 0;

        for (int n : list) {
            ret += n;
        }

        return ret;
    }

}