package baekjoon.p05355;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            String result = solve(input);
            System.out.println(result);
        }
    }

    private static String solve(String input) {
        String[] arr = input.split(" ");
        double num = Double.parseDouble(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            switch (arr[i]) {
                case "@":
                    num *= 3;
                    break;
                case "%":
                    num += 5;
                    break;
                case "#":
                    num -= 7;
                    break;
            }
        }

        return String.format(Locale.getDefault(), "%.2f", num);
    }

}