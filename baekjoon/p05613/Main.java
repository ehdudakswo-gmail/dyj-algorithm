package baekjoon.p05613;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String input = sc.next();
            if (input.equals("=")) {
                break;
            }

            inputs.add(input);
        }

        System.out.println(solve(inputs));
    }

    private static int solve(List<String> inputs) {
        int ret = Integer.parseInt(inputs.get(0));

        for (int i = 1; i < inputs.size(); i += 2) {
            String op = inputs.get(i);
            int n = Integer.parseInt(inputs.get(i + 1));

            switch (op) {
                case "+":
                    ret += n;
                    break;
                case "-":
                    ret -= n;
                    break;
                case "*":
                    ret *= n;
                    break;
                case "/":
                    ret /= n;
                    break;
            }
        }

        return ret;
    }

}