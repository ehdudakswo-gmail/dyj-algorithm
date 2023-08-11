package baekjoon.p09610;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> input = new ArrayList<>();

        while (n-- > 0) {
            input.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        for (String str : solve(input)) {
            System.out.println(str);
        }
    }

    private static List<String> solve(List<Point> input) {
        List<String> ret = new ArrayList<>();
        int[] q = new int[5];

        for (Point point : input) {
            int x = (int) point.getX();
            int y = (int) point.getY();

            if (x == 0 || y == 0) {
                q[0]++;
            } else if (x > 0 && y > 0) {
                q[1]++;
            } else if (x < 0 && y > 0) {
                q[2]++;
            } else if (x < 0 && y < 0) {
                q[3]++;
            } else if (x > 0 && y < 0) {
                q[4]++;
            }
        }

        for (int i = 1; i <= 4; i++) {
            ret.add(String.format("Q%d: %d", i, q[i]));
        }
        ret.add(String.format("AXIS: %d", q[0]));

        return ret;
    }

}