package baekjoon.p02712;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextDouble(), sc.next()));
        }
    }

    private static String solve(double a, String b) {
        return String.format("%.4f %s", value(a, b), measure(b));
    }

    private static double value(double a, String b) {
        switch (b) {
            case "kg":
                return (a * 2.2046);
            case "lb":
                return (a * 0.4536);
            case "l":
                return (a * 0.2642);
            case "g":
                return (a * 3.7854);
            default:
                return 0;
        }
    }

    private static String measure(String str) {
        switch (str) {
            case "kg":
                return "lb";
            case "lb":
                return "kg";
            case "l":
                return "g";
            case "g":
                return "l";
            default:
                return "";
        }
    }

}