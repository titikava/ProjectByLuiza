package zadachnik;

import java.io.Serializable;
import java.util.Scanner;

public class FloorsHome {
    static int[][] dom = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static Scanner keyboard = new Scanner(System.in);
    static int numb = keyboard.nextInt();

    public static void main(String[] args) {
        System.out.print(floors(dom).toString() + locate(dom));
    }

    public static Serializable floors(int[][] dom) {
        String goAway = "Нет такой квартиры";
        String what = "";
        int floors = 1;
        if (numb > 0 && numb < 10) {
            for (int i = 0; i < dom.length; i++) {
                if (numb == dom[0][i]) {
                    floors = 1;
                    System.out.println(floors + " этаж");
                }
                if (numb == dom[1][i]) {
                    floors = 2;
                    System.out.println(floors + " этаж");
                }
                if (numb == dom[2][i]) {
                    floors = 3;
                    System.out.println(floors + " этаж");
                }
            }
        } else {
            return goAway;
        }
        return what;
    }

    public static Serializable locate(int[][] dom) {
        String what = "";
        if (numb > 0 && numb < 10) {
            for (int[] ints : dom) {
                if (numb == ints[0]) {
                    System.out.println("Слева");
                }
                if (numb == ints[1]) {
                    System.out.println("В центре");
                }
                if (numb == ints[2]) {
                    System.out.println("Справа");
                }
            }
        }
        return what;
    }
}
