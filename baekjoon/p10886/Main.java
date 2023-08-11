package baekjoon.p10886;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        while (n-- > 0) {
            if (sc.nextInt() == 0) {
                cnt--;
            } else {
                cnt++;
            }
        }

        System.out.println(cnt > 0 ? "Junhee is cute!" : "Junhee is not cute!");
    }

}