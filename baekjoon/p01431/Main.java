package baekjoon.p01431;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputs = new String[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(String[] inputs) {
        Arrays.sort(inputs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int aLen = a.length();
                int bLen = b.length();
                if (aLen != bLen) {
                    return aLen - bLen;
                } else {
                    int aSum = sum(a);
                    int bSum = sum(b);
                    if (aSum != bSum) {
                        return aSum - bSum;
                    } else {
                        return a.compareTo(b);
                    }
                }
            }
        });

        return inputs;
    }

    private static int sum(String str) {
        int ret = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                ret += (ch - '0');
            }
        }

        return ret;
    }

}