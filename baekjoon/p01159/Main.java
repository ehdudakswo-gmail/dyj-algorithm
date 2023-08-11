package baekjoon.p01159;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputs = new String[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        List<Character> solves = solve(inputs);
        if (solves.size() == 0) {
            System.out.print("PREDAJA");
            return;
        }

        for (char solve : solves) {
            System.out.print(solve);
        }
    }

    private static List<Character> solve(String[] inputs) {
        int[] arr = new int[26];
        for (String input : inputs) {
            char ch = input.charAt(0);
            arr[ch - 'a']++;
        }

        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                ret.add((char) (i + 'a'));
            }
        }

        return ret;
    }

}