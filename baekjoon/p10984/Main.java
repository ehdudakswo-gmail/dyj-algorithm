package baekjoon.p10984;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            P10984[] inputs = new P10984[n];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = new P10984(sc.nextInt(), sc.nextDouble());
            }

            P10984 ret = solve(inputs);
            System.out.println(ret.getC() + " " + ret.getG());
        }
    }

    private static P10984 solve(P10984[] inputs) {
        int sum = 0;
        double sum2 = 0;

        for (P10984 ret : inputs) {
            sum += ret.getC();
            sum2 += (ret.getC() * ret.getG());
        }

        double avg = (sum2 / sum);
        double roundAvg = getRound(avg, 1);

        return new P10984(sum, roundAvg);
    }

    private static double getRound(double num, double pos) {
        double ret = num;
        double mul = Math.pow(10, pos);

        ret *= mul;
        ret += 0.5;
        ret = (int) ret;
        ret /= mul;

        return ret;
    }

}

class P10984 {

    private int c;
    private double g;

    P10984(int c, double g) {
        this.c = c;
        this.g = g;
    }

    int getC() {
        return c;
    }

    double getG() {
        return g;
    }

}