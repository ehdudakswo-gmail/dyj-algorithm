package baekjoon.p09226;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.next();
            if (input.equals("#")) break;
            System.out.println(solve(input));
        }
    }

    private static String solve(String input) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int idx = 0;
        for (int i = 0; i < input.length(); i++) {
            if (set.contains(input.charAt(i))) {
                idx = i;
                break;
            }
        }

        String ret = "";
        ret += input.substring(idx);
        ret += input.substring(0, idx);
        ret += "ay";

        return ret;
    }

}