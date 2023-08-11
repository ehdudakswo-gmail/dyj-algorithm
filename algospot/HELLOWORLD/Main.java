package algospot.HELLOWORLD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new HELLOWORLD().solve();
    }

}

class HELLOWORLD {

    public void solve() {
        List<String> input = getInput();
        List<String> answer = getAnswer(input);
        print(answer);
    }

    private List<String> getInput() {
        Scanner scanner = new Scanner(System.in);
        int numOfCase = scanner.nextInt();

        List<String> ret = new ArrayList<>(numOfCase);
        for(int i=0; i<numOfCase; i++) {
            ret.add(scanner.next());
        }

        scanner.close();
        return ret;
    }

    private List<String> getAnswer(List<String> input) {
        List<String> ret = new ArrayList<>(input.size());

        for(String element : input) {
            String answer = String.format("%s, %s!", "Hello", element);
            ret.add(answer);
        }

        return ret;
    }

    private void print(List<String> list) {
        for(String element : list) {
            System.out.println(element);
        }
    }

}