package baekjoon.p11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        String line2 = br.readLine();
        int n = Integer.parseInt(lines[0]);
        int k = Integer.parseInt(lines[1]);

        int[] inputs = new int[n];
        StringTokenizer st = new StringTokenizer(line2);
        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(inputs, k));
    }

    private static int solve(int[] inputs, int k) {
        Arrays.sort(inputs);
        return inputs[k - 1];
    }

}