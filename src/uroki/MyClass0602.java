package uroki;
import object.*;

import jdk.internal.icu.lang.UCharacterDirection;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class MyClass0602 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
        String a = keyboard.nextLine();
        String b = keyboard.nextLine();
     /*   char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        System.out.println(Arrays.toString(x) + "\n" + Arrays.toString(y));*/
        if (Objects.equals(a, b)) {
            System.out.println("Пароль принят");
        } else {
            System.out.println("Пароль не принят");
        }
      /*  byte b = 5;
        byte c = 4;
        byte sum = (byte) (b + c);

        int a = 5;
        byte a1 = (byte) a;

        //sevenPlusTwo();
        //fiveToOne();
        // fiveAndOne();
        // sevenPlus();
        // multiplicationTable();
        multiplicationTableAll(5);

     /*   int r = 258;
        byte t = (byte) r;
        System.out.println(t);

       double l = 54.98;
        int f = (int) l;
        System.out.println(f);
        int s = (int) Math.round(l);
        System.out.println(s);

        addOneTo(a);
        System.out.println(a);

        object.Microwave micro4 = new object.Microwave();
        micro4.setSize(20);
        addOneToSize(micro4);
        System.out.println(micro4.getSize());*/

    }
    public static void addOneToSize(Microwave c){
        c.setSize(c.getSize()+1);
    }

    public static void addOneTo(int number){
        number = number + 1;
    }

    //числа на экран с 5 до 1 с одной переменной
    public static void fiveAndOne (){
        int five = 5;
        do {
            System.out.print(five + " ");
            five--;
        }
        while (five >=1);
    }


    public static void fiveToOne (){
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
    }


    //числа на экран с 7 до 98
    public static void sevenPlus() {
        int seven = 7;
        do {
            System.out.print(seven + " ");
            seven = seven + 7;
        }
        while (seven < 99);
    }

    public static void sevenPlusTwo() {
        int a = 7;
        while(a < 99) {
            System.out.print(a + " ");
            a = a + 7;
        }
    }

    //таблица умножения на 3
    public static void multiplicationTable() {
        int three = 3;
        for (int i = 1; i < 11; i++) {
            int result = 3 * i;
            System.out.println(three + "*" + i + "=" + result);
        }
    }

    public static void multiplicationTableAll(int number) {
        for (int i = 1; i < 11; i++) {
            System.out.println(number + "*" + i + "=" + number*i);
        }
    }
}
