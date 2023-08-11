package baekjoon.p07785;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<String> solve(String[] inputs) {
        HashSet<String> hashSet = new HashSet<>();

        for (String input : inputs) {
            String[] arr = input.split(" ");
            if (arr[1].equals("enter")) {
                hashSet.add(arr[0]);
            } else {
                hashSet.remove(arr[0]);
            }
        }

        List<String> ret = new ArrayList<>(hashSet);
        Collections.sort(ret);
        Collections.reverse(ret);

        return ret;
    }

}