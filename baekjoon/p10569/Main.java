package baekjoon.p10569;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] inputs = new int[]{
                    sc.nextInt(),
                    sc.nextInt()
            };

            int ret = 2 - inputs[0] + inputs[1];
            System.out.println(ret);
        }
    }

}