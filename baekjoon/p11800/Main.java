package baekjoon.p11800;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            String[] solves = solve(sc.nextInt(), sc.nextInt());
            System.out.println(String.format("Case %d: %s %s", i, solves[0], solves[1]));
        }
    }

    private static String[] solve(int a, int b) {
        String[] diff = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
        String[] same = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};
        int[] arr = {a, b};
        descending(arr);

        if (arr[0] == arr[1]) {
            return new String[]{same[arr[0]], ""};
        } else if (arr[0] == 6 && arr[1] == 5) {
            return new String[]{"Sheesh", "Beesh"};
        } else {
            return new String[]{diff[arr[0]], diff[arr[1]]};
        }
    }

    private static void descending(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}