package baekjoon.p04766;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> inputs = new ArrayList<>();

        while (true) {
            double input = sc.nextDouble();
            if (input == 999) {
                break;
            }

            inputs.add(input);
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(List<Double> inputs) {
        String[] ret = new String[inputs.size() - 1];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = String.format("%.2f", inputs.get(i + 1) - inputs.get(i));
        }

        return ret;
    }

}