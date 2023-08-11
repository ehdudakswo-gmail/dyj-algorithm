package baekjoon.p02312;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            for (int[] solve : solve(sc.nextInt())) {
                System.out.println(solve[0] + " " + solve[1]);
            }
        }
    }

    private static List<int[]> solve(int n) {
        List<int[]> ret = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            int pow = pow(n, i);
            if (pow != 0) {
                ret.add(new int[]{i, pow});
                n /= Math.pow(i, pow);
            }
        }

        return ret;
    }

    private static int pow(int n, int x) {
        int ret = 0;

        while (n % x == 0) {
            n /= x;
            ret++;
        }

        return ret;
    }

}