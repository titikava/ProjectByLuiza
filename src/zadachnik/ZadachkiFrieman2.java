package zadachnik;

import java.util.Arrays;
import java.util.Scanner;

public class ZadachkiFrieman2 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // randomNumbers20();
        // numbersWithQuestion();
        // logicalExpressions();
        //  break999();
        int[][] massive = {{3, 7, 19}, {37, 42, 44}, {79, 97, 60}};//простых 6
        int[][] massive2 = {{3, 7, 19}, {3, 4, 5}, {5, 4, 5}};
        int[] mass1 = {1, 5, 10, 2, 2, 6};
        int[] mass2 = {6, 5, 8, 2, 3, 6};
        int secretNumb = 5;
        //System.out.println(Arrays.deepToString(massZero(massive, secretNumb)));
        //massTable(massive);
        //massValuePair2(mass1, mass2);
       // System.out.println(sumDiagonal(massive));
        //System.out.println(simpleNum(massive));
        //System.out.println(comparingMassive(massive, massive2));
        System.out.println(orderedNumbersInRow(massive2, 2));
    }

    //проверить содержит ли строка К - упорядоченные значения
    public static boolean orderedNumbersInRow(int[][] array, int k) {
        for (int i = k; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i][j] < array[i][j+1]) {
                    return true;
                }
            }
        }
        return false;
    }



    //Сравнить одинаковое ли количество строк в двумерных массивах
    public static boolean comparingMassive(int[][] mass1, int[][] mass2) {
        for (int i = 0; i < mass1.length || i < mass2.length; i++) {
            for (int j = 0; j < mass1[i].length || j < mass2.length; j++) {
                if (mass1[j].length != mass2[j].length) {
                    return false;
                }
            }
        }
        return true;
    }

    //Получаем двумерный массив целых чисел и и возвращаем кол-во простых чисел в массиве
    public static int simpleNum(int[][] mass) {
        boolean is_simple = true;
        int x = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                for (x = 2; x <= Math.sqrt(mass[i][j]); x++) {
                    if (mass[i][j] % x == 0) {
                        is_simple = false;
                    } if (is_simple) {
                        count++;
                    }
                }
            }
        }return count;
    }

    //Получаем двумерный массив и возвращаем сумму его значений по диагонали (левой). Массив имеет одинаковое кол-во столбцов и строк
    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i][i];
        }
        return sum;
    }


    //Метод. Принимает два массива. Размеры одинаковы. Определить сколько пар "параллельных" ячеек в этих массивах
    //содержат одинаковые значения и вернуть новый массив из этих значений
    public static void massValuePair2(int[] mass1, int[] mass2) {
        //создаем массив
        int y = 0; // переменную с нулем
        for (int i = 0; i < mass1.length; i++) { //проходимся по первому массиву
            if (mass1[i] == mass2[i]) { // сравниваем значения
                y++;// маппим все это дело в наш массив3
            }
        }
        int[] mass3 = new int[y];
        for (int i = 0, j = 0; i < mass1.length; i++) { //проходимся по первому массиву
            if (mass1[i] == mass2[i]) { // сравниваем значения
                mass3[j] = mass2[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(mass3));
    }


    public static void massValuePair(int[] mass1, int[] mass2) {
        int[] mass3 = new int[mass2.length]; //создаем массив
        int y = 0; // переменную с нулем
        for (int i = 0; i < mass1.length; i++) { //проходимся по первому массиву
            if (mass1[i] == mass2[i]) { // сравниваем значения
                mass3[i] = mass2[i]; // маппим все это дело в наш массив3
            }
        }
        for (int j = 0; j < mass3.length; j++) { //проходимся по нашему массиву
            if (mass3[j] == 0) {
                y++; // считаем сколько в нем нулей
            }
        }
        int[] mass4 = new int[mass3.length - y]; // создаем новый массив с длинной за вычетом нулей
        for (int i = 0, j = 0; i < mass3.length; i++) { // проходимся по третьему массиву
            if (mass3[i] != 0) {
                mass4[j] = mass3[i]; // и если его цифра не равна 0, то маппим его в наш новый массив
                j++; //нам нужно добавлять индекс j только если сработало условие, поэтому он тут а не внутри условия цикла
            }
        }
        System.out.println(Arrays.toString(mass4));
    }


    //----------------------------------ДВА ВАРИАНТА РЕШЕНИЯ----------------
    //Метод, который получает в качестве параметра двумерный массив и выводит его на экран в табличной форме
    public static void massTable(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.print("\n");
        }
        // System.out.println(Arrays.deepToString(mass).replace("],", "]\n"));
    }


    //Метод, который получает в качестве параметров двумерный массив чисел и число Х.
    //Метод заменяет в массиве все значения, отличные от Х на 0
    public static int[][] massZero(int[][] mass, int x) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] != x) {
                    mass[i][j] = 0;
                }
            }
        }
        return mass;
    }


    //Функция, которая принимает с клавиатуры числа, пока не будет введено значение 999
    //Надо посчитать сколько значений было введено с клавиатуры (не считая 999) и вывести инфу на экран
    public static void break999() {
        int numbNext = keyboard.nextInt();
        int sum = 0;
        while (numbNext != 999) {
            sum = sum + 1;
            numbNext = keyboard.nextInt();
        }
        System.out.println(sum);
    }


    /*
    Значение переменной больше 90 - if (x > 90)
    Оценка - не меньше 75  - if (x >= 75)
    Разница между значениями отлична от 0 - if ((x - y) != 0)
    Значение не превышает 200 - if (x <= 200)
    Значение хотя бы не больше 120 - if (x < 120)
    Значение одной переменной равно сумме значений двух других переменных - if (x == (y + z))
     */


    //a=0, b=-3, c=9 true или false
    public static void logicalExpressions() {
        int a = 0;
        int b = -3;
        int c = 9;
        if (((a + b) * 3 == -9)) {
            System.out.println("1" + true);
        } else {
            System.out.println("1" + false);
        }
        if (b * a == c * (-a)) {
            System.out.println("2" + true);
        } else {
            System.out.println("2" + false);
        }
        if (c / b == b * (-1)) {
            System.out.println("3" + true);
        } else {
            System.out.println("3" + false);
        }
        if ((-b) * (-b) >= c) {
            System.out.println("4" + true);
        } else {
            System.out.println("4" + false);
        }
        if (b / (-c) == 1 / b) {
            System.out.println("5" + true);
        } else {
            System.out.println("5" + false);
        }
        if (80 >= 80) {
            System.out.println("6" + true);
        } else {
            System.out.println("6" + false);
        }
        if (b * b != a * c) {
            System.out.println("7" + true);
        } else {
            System.out.println("7" + false);
        }
        if (b < a) {
            System.out.println("8" + true);
        } else {
            System.out.println("8" + false);
        }
        if (b * b == c) {
            System.out.println("9" + true);
        } else {
            System.out.println("9" + false);
        }
        if ((-c) / b == -b) {
            System.out.println("10" + true);
        } else {
            System.out.println("10" + false);
        }
    }


    //Функция которая выводит на экран (в одну строку) 15 случайных
    //чисел из диапазона -20".+35. После каждого отрицательного числа
    //следует вывести (вплотную к числу) символ«?» (знак вопроса).

    public static void numbersWithQuestion() {
        int a = -20;
        int b = 35;
        for (int i = a; i <= -5; i++) {
            int y = (int) (a + Math.random() * (b - a));
            if (y < 0) {
                System.out.println(y + "?");
            } else {
                System.out.println(y);
            }
        }
    }


    //Принимает с клавиатуры два целых числа и выводит на экран 20 случайных чисел в этом диапазоне
    public static void randomNumbers20() {
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        if (a < b) {
            for (int i = a; i <= 20; i++) {
                int y = (int) (a + Math.random() * (b - a));
                System.out.println(y);
            }
        } else {
            for (int i = b; i <= 20; i++) {
                int y = (int) (b + Math.random() * (a - b));
                System.out.println(y);
            }
        }
    }
}

