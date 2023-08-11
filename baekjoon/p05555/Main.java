package baekjoon.p05555;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        System.out.println(solve(str, inputs));
    }

    private static int solve(String str, String[] inputs) {
        int ret = 0;

        for (String input : inputs) {
            if ((input + input).contains(str)) {
                ret++;
            }
        }

        return ret;
    }

}