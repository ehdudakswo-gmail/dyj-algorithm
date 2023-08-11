package baekjoon.p01924;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int x, int y) {
        int diff = 0;

        for (int i = 1; i < x; i++) {
            diff += day(i);
        }

        diff += y;
        return Week.get(diff % 7).toString();
    }

    private static int day(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 28;
        }
    }

    private enum Week {

        SUN, MON, TUE, WED, THU, FRI, SAT;

        static Week get(int week) {
            for (Week value : values()) {
                if (value.ordinal() == week) {
                    return value;
                }
            }

            return null;
        }
    }

}