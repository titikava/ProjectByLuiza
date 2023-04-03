package uroki;

import java.math.BigDecimal;
import java.util.Arrays;

public class MyClass3001 {
    public int sun; //глобальная переменная


    public static void main(String[] args) {
        int[][] mass = {{32, 64, 51}, {44, 21, 72}, {81, 14, 68}};
        int a = 10; //локальная переменная
        byte b = 1;
        byte c = 2;
        byte result = (byte) (a + b);//принудительно ставлю байт тип
        short s = 32000;
        int f = 2000000000;
        long r = 20000000003134134L;
        float t = 3.14F;
        float g = 13.3F;
        double u = 3.141592324234332;
        BigDecimal bigDecimal = new BigDecimal(150);//это деньги
        int pars = Integer.parseInt("123");//он тебе инт вернет, братишка
        char ci = 'a';
        char ci2 = '\n';
        char ci3 = '\u0008';
        char ci4 = 102;
        //System.out.println(ci4);
        int three = 3;
        char one = '1';
        char four = (char) (three + one);
        // System.out.println(massiv1(mass));
        // System.out.println(srArifmet(3.3F, g));
        System.out.println(Arrays.toString(massiv2Version2(mass)));
    }


    //Среднее арифметическое
    public static float srArifmet(float num1, float num2) {
        return (num1 + num2) / 2;
    }

    //Сумма всех элементов в массиве
    // Как передавать массив сразу в функции, что бы в мейн методе мы просто написали соут и нужный нам массив?
    //идея предлагает по другому, интересено разобрать этот момент
    public static int massiv1(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }


    public static int[] massiv2(int[][] mass) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i][0];
        }
        for (int i = 0; i < mass.length; i++) {
            sum1 = sum1 + mass[i][1];
        }
        for (int i = 0; i < mass.length; i++) {
            sum2 = sum2 + mass[i][2];
        }
        int[] mass1 = {sum, sum1, sum2};
        return mass1;
    }

    public static int[] massiv2Version2(int[][] mass) {
        int[] arr = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < mass.length; i++) {
                arr[j] = arr[j] + mass[i][j];
            }
        }
        return arr;
    }
  /*  public static Microwave funk(){
        Microwave microwave = new Microwave();
        return microwave;
    }*/
}
