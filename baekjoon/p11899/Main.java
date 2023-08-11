package baekjoon.p11899;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        int ret = 0;
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        ret++;
                    } else {
                        stack.pop();
                    }
                    break;
            }
        }

        ret += stack.size();
        return ret;
    }

}