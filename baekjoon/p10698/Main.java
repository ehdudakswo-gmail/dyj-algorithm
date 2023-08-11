package baekjoon.p10698;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= t; i++) {
            String solve = solve(sc.nextLine());
            System.out.println(String.format("Case %d: %s", i, solve));
        }
    }

    private static String solve(String input) {
        String[] inputs = input.split(" ");
        int a = Integer.parseInt(inputs[0]);
        String op = inputs[1];
        int b = Integer.parseInt(inputs[2]);
        int c = Integer.parseInt(inputs[4]);

        boolean ret = false;
        switch (op) {
            case "+":
                ret = (a + b == c);
                break;
            case "-":
                ret = (a - b == c);
                break;
        }

        if (ret) {
            return "YES";
        } else {
            return "NO";
        }
    }

}