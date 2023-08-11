package baekjoon.p11931;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static final int N = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        boolean[] check = new boolean[N * 2 + 1];

        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(in.readLine()) + N;
            check[idx] = true;
        }

        for (int solve : solve(n, check)) {
            out.write(String.valueOf(solve));
            out.write("\n");
        }

        in.close();
        out.close();
    }

    private static int[] solve(int n, boolean[] check) {
        int[] ret = new int[n];
        int idx = 0;

        for (int i = check.length - 1; i >= 0; i--) {
            if (check[i]) {
                ret[idx++] = (i - N);
            }
        }

        return ret;
    }

}