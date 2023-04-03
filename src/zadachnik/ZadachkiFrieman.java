package zadachnik;

import uroki.*;

import java.awt.dnd.DragSource;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ZadachkiFrieman {
    final static int PASSWORD = 133976;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "Игристое или нет";
        char sumb = 'и';
        // char sumb1 = sumb.charAt(0);
        int[] spisok = {1, 2, 7, 3, 5};
        int[][] dom = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //  x2(3);
        //  ifNull(0);
        //  zadanie67(100);
          zadanie69(748);
        //  zadanie76(5, 6);
        // zadanie811(10, 10);
        // stepik();
        // System.out.println(sumSimvol(str, sumb));
        // System.out.println(mediana(spisok));
        // System.out.println(sequence(spisok));
        //System.out.println(polindrom(spisok));
        // System.out.println(polindrom1());
        // ploshIPerimetr();
       // pesochnie4asi(6);
        // ploskoe();
        //cherezProbel();
        //valuta();
       // farengaitVCelsii();
       // System.out.println(example());
       // positiveOrNegativeNum();
       // twiceEven();
       // System.out.println(example());
    }
    //Проверка на дважды четное число
    public static void twiceEven() {
        int numb = keyboard.nextInt();
        int a = numb % 10;
        int b = (numb % 100) / 10;
        int c = numb / 100;
        if (numb % 2 == 0 && (a+b+c) % 2 == 0) {
            System.out.println("Дважды четное");
        } else {
            System.out.println("Не прошло проверочку");
        }
    }

    //Функция, которая принимает целое трехзначное число и проверяет, что каждая его цифра четная и выводит на экран рзультат проверки
    public static void zadanie69(int z69) {
        int a = z69 % 10;
        int b = (z69 % 100) / 10;
        int c = z69 / 100;
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println("Все числа четные");
        } else {
            System.out.println("Есть нечетное число");
        }
    }

    //Принимает число и ыводит на экран положительное, отрицательное или ноль
    public static void positiveOrNegativeNum() {
        int a = keyboard.nextInt();
        if (a > 0) {
            System.out.println("Положительное");
        } else if (a < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }


    //Выводить true или false в случае если выражение верно или нет (z>x)||(x<0)&&(z-y>9)
    public static boolean example() {
        int z = keyboard.nextInt();
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        return ((z > x) || (x < 0)) && ((z - y) > 9);
    }

    //фаренгейты в цельсии (формула С=5(F-32)/9 )
    public static void farengaitVCelsii() {
        double tFar = keyboard.nextDouble();
        System.out.println(5 * (tFar - 32) / 9);
    }

    //валютная штука
    public static void valuta() {
        double sum = keyboard.nextDouble();
        double curs = keyboard.nextDouble();
        System.out.print(sum * curs);
    }


    //Принимает трехзначное число с клавиатуры и выводит его числа, разделенные пробелом
    public static void cherezProbel() {
        int numb = keyboard.nextInt();
        if (numb > 99 && numb < 1000) {
            System.out.print(numb / 100 + " " + (numb % 100) / 10 + " " + numb % 10);
        } else {
            System.out.println("Не подходит");
        }
    }


    //узнать "плоское" трехзначное число или нет
    public static void ploskoe() {
        int numb = keyboard.nextInt();
        if (numb > 1000) {
            System.out.println("Слишком много символов");
        }
        if (numb < 99) {
            System.out.println("Слишком мало символов");
        }
        if (numb > 99 && numb < 1000) {
            int three = numb % 10;
            int two = (numb % 100) / 10;
            int one = numb / 100;
            if (three == two && two == one) {
                System.out.println("Плоское");
            } else {
                System.out.println("Не плоское");
            }
        }
    }


    //Вывести true если число является полиндромом - т.е. вперед и назад читается одинаково - 17371
    public static boolean polindrom1() {
        //StringRev rev = new StringRev();
        String s = keyboard.next();
        String b = new StringBuilder(s).reverse().toString();
        return s.equals(b);

    }


    //рассчитать площадь и периметр прямоугольного треугольника
    public static void ploshIPerimetr() {
        double gepot = keyboard.nextDouble();
        double katet1 = keyboard.nextDouble();
        double katet2 = keyboard.nextDouble();
        System.out.println("Периметр равняется " + (gepot + katet1 + katet2));
        System.out.println("Площадь равняется " + ((katet1 * katet2) / 2));
    }


    //Выводит песочные часы, составленные из каого либо символа (половина часов)
    public static void pesochnie4asi(int number) {
        char simba = 'f';
        for (int i = number; i > 1; i--) {
            for (int g = 0; g < i; g++) {
                System.out.print(simba + " ");
            }
            System.out.print("\n");
        }
        for (int i = 1; i < number + 1; i++) {
            for (int g = 0; g < i; g++) {
                System.out.print(simba + " ");
            }
            System.out.print("\n");
        }
    }


    //есть массив чисел. Тебе нужно отдавать true в случае, если в массиве встречается последовательность минимум из
    // 3х чисел, которые идут друг за другом
    public static boolean sequence(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] == array[i] + 1 && array[i + 2] == array[i] + 2) {
                return true;
            }
        }
        return false;
    }

    //посчитать количество определенного символа (например о) в строке
    public static int sumSimvol(String str, char sumb) {
        String str1 = str.toLowerCase(Locale.ROOT);
        char[] carray = str1.toCharArray();
        int g = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (carray[i] == sumb) {
                g = g + 1;
            }
        }
        return g;
    }


    //Напишите функцию, которая, если число положительное, увеличивает его вдвое
    public static void x2(int a) {
        if (a > 0) {
            a = a * 2;
            System.out.println(a);
        } else {
            System.out.println("Нужно положительное число");
        }
    }

    //функция который принимает целое число и если оно равно нулю, то выводит НОЛЬ, если положительное или отрицательное, то соответственно
    public static void ifNull(int b) {
        if (b == 0) {
            System.out.println("НОЛЬ");
        }
        if (b > 0) {
            System.out.println("Положительное число");
        }
        if (b < 0) {
            System.out.println("Отрицательное число");
        }
    }

    //Функция, которая принимает целое положительное число и если оно треъзначное и положительное, то уменьшает его на 1
    public static void zadanie67(int z67) {
        if (z67 > 99 & z67 < 1000) {
            z67 = z67 - 1;
            System.out.println(z67);
        } else {
            System.out.println("Не принимаю такую херь");
        }
    }

    //Прикольная


    //функция, которая проверяет равны ли друг другу числа
    public static void zadanie76(int x, int y) {
        if (x == y) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }

    //функция, которая принимает два числа. Первое - кол-во учеников, второе - кол-во стульев. Если стулья лишние или не хватает программа сообщает
    //сколько стульев лишних или сколько не хватает

    public static void zadanie811(int uchenik, int stul) {
        if (uchenik > stul) {
            System.out.println("Стульев не хватает: " + (uchenik - stul));
        }
        if (stul > uchenik) {
            System.out.println("Лишних стульев: " + (stul - uchenik));
        }
        if (stul == uchenik) {
            System.out.println("Всех посадим");
        }
    }

    public static void stepik() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        int x = array[0] - array[1];
        System.out.println("\n" + "День минус ночь = " + x);
        if (x > 0) {
            for (int i = 0; i < array.length; i++) {
                int y = array[2] - x;
                System.out.println(y);
            }
        }
    }


    //считает количество повторяющихся символов
    public static void povtorSimvol() {
        String str = "Молоко";
        char[] carray = str.toCharArray();
        int g = 0;
        System.out.println(Arrays.toString(carray));
        System.out.print("Повторяющиеся символы: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    g = g + 1;
                }
            }
        }
        System.out.print(g);
    }


    //Найти медиану чисел
    public static double mediana(int[] spisok) {
        Arrays.sort(spisok);
        int mid = spisok.length / 2;
        if (spisok.length % 2 != 0) {
            return spisok[mid];
        }
        if (spisok.length % 2 == 0) {
            return (spisok[mid - 1] + spisok[mid]) / 2.0;
        }
        return mid;
    }

}




      /*
       int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int h = keyboard.nextInt();
        int vershina = h - (b - a);
        int x = b - a;


      Напишите простую программу, которая:
запрашивает количество незнакомцев, с которыми нужно встретиться и их имена перечисленные через пробел
построчно выводит: "Привет, (имя незнакомца)" для каждого незнакомца.
Гарантируется, что введенное количество незнакомцев — целое число.
Частные случаи:
Если количество незнакомцев равно нулю, программа должна вывести: "Оу... Похоже здесь никого...".
Если количество незнакомцев отрицательное, программа должна вывести: "Серьезно? А что так негативно?".

      int x = keyboard.nextInt();
        for (int i = 1; i <= x; i++) {
            String y = keyboard.next();
            System.out.println("Привет, " + y);
        }
        if (x < 0) {
            System.out.println("Серьезно? А что так негативно?");
        }
        if (x == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        }*/
