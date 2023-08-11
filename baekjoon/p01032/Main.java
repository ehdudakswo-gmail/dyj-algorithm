package baekjoon.p01032;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[sc.nextInt()];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        System.out.println(solve(inputs));
    }

    private static String solve(String[] inputs) {
        StringBuilder sb = new StringBuilder();
        int strLen = inputs[0].length();

        for (int i = 0; i < strLen; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (String str : inputs) {
                hashSet.add(str.charAt(i));
            }

            if (hashSet.size() == 1) {
                sb.append(inputs[0].charAt(i));
            } else {
                sb.append('?');
            }
        }

        return sb.toString();
    }

}