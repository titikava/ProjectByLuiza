package zadachnik;

import java.util.Scanner;

public class FloorsHomeProdLuiza {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numb = keyboard.nextInt();
        getFloorsAndAppart(numb);
    }

    public static void getFloorsAndAppart(int number) {
        if (number > 0) {
            int floors;
            if (number % 3 == 0) {
                floors = number / 3;
            } else {
                floors = (number / 3) + 1;
            }
            System.out.println("Этаж: " + floors);
            int apparts = (floors * 3) - number;
            switch (apparts) {
                case 0 -> System.out.println("Справа");
                case 1 -> System.out.println("В центре");
                case 2 -> System.out.println("Слева");
            }
        } else {
            System.out.println("Обавдел?");
        }
    }
}
