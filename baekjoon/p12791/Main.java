package baekjoon.p12791;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<P12791> list = new ArrayList<>();

    public static void main(String[] args) {
        list();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            List<P12791> solve = solve(sc.nextInt(), sc.nextInt());
            System.out.println(solve.size());
            if (solve.size() > 0) {
                for (P12791 e : solve) {
                    System.out.println(e.a + " " + e.b);
                }
            }
        }
    }

    private static class P12791 {

        int a;
        String b;

        P12791(int a, String b) {
            this.a = a;
            this.b = b;
        }

    }

    private static void list() {
        list.add(new P12791(1967, "DavidBowie"));
        list.add(new P12791(1969, "SpaceOddity"));
        list.add(new P12791(1970, "TheManWhoSoldTheWorld"));
        list.add(new P12791(1971, "HunkyDory"));
        list.add(new P12791(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"));
        list.add(new P12791(1973, "AladdinSane"));
        list.add(new P12791(1973, "PinUps"));
        list.add(new P12791(1974, "DiamondDogs"));
        list.add(new P12791(1975, "YoungAmericans"));
        list.add(new P12791(1976, "StationToStation"));
        list.add(new P12791(1977, "Low"));
        list.add(new P12791(1977, "Heroes"));
        list.add(new P12791(1979, "Lodger"));
        list.add(new P12791(1980, "ScaryMonstersAndSuperCreeps"));
        list.add(new P12791(1983, "LetsDance"));
        list.add(new P12791(1984, "Tonight"));
        list.add(new P12791(1987, "NeverLetMeDown"));
        list.add(new P12791(1993, "BlackTieWhiteNoise"));
        list.add(new P12791(1995, "1.Outside"));
        list.add(new P12791(1997, "Earthling"));
        list.add(new P12791(1999, "Hours"));
        list.add(new P12791(2002, "Heathen"));
        list.add(new P12791(2003, "Reality"));
        list.add(new P12791(2013, "TheNextDay"));
        list.add(new P12791(2016, "BlackStar"));
    }

    private static List<P12791> solve(int a, int b) {
        List<P12791> ret = new ArrayList<>();
        for (P12791 e : list) {
            if (e.a >= a && e.a <= b) {
                ret.add(e);
            }
        }

        return ret;
    }

}