package baekjoon.p02789;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        HashSet<Character> except = new HashSet<>();
        for (char ch : "CAMBRIDGE".toCharArray()) {
            except.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (except.contains(ch)) {
                continue;
            }

            sb.append(ch);
        }

        return sb.toString();
    }

}