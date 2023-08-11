package baekjoon.p01316;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputs = new String[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(String[] inputs) {
        int ret = 0;

        for (String input : inputs) {
            if (check(input)) {
                ret++;
            }
        }

        return ret;
    }

    private static boolean check(String str) {
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char current = str.charAt(i);

            if (hashSet.contains(current) && pre != current) {
                return false;
            } else {
                hashSet.add(current);
            }
        }

        return true;
    }

}