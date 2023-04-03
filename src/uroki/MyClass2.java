package uroki;
import object.*;

import java.io.Serializable;

public class MyClass2 {

    public int sun;

    public static void main(String[] args) {
        int one = 23;
        int two = 24;
        int[] hold = {1, 5, 10, 13};
        int max = big(one, two);

   /*    Microwave micro2 = new Microwave();
        System.out.println(micro2.getSize());

        Microwave micro3 = new Microwave("LG", 500, "Black");
        System.out.println(micro3.getSize() + "\n" + micro3.getManufacturer() + "\n" + micro3.getColor());
*/
        Popuga popuga1 = new Popuga();
        popuga1.setModel("RichBitch");
        popuga1.setYears(10);
        System.out.println(popuga1.getModel() + " " + popuga1.getYears());

        System.out.println(zadanie3(20,10,30));



        //Первое задание, результат:
    /*  for (int i = 0; i < hold.length; i++) {
          timeToDie(hold[i]);
      }*/
        //Второе задание, результат:
        //sumTwoChisel(3, 101);
        // System.out.println(sumTwoChisel(0,101));

        //Второе задание, другое решение:
      /*  int vtoroeZadanie = sumTwoChisel2(0, 101);
        if (vtoroeZadanie != 0) {
            System.out.println(vtoroeZadanie);
        } else {
            System.out.println("sdsdfsdf");
        }        */

     /*  System.out.println(max);
        System.out.println(sumMass(hold));
        vigo(hold);*/

       /* object.Microwave Micro1 = new object.Microwave();
        Micro1.setManufacturer("dfgdfg");
        System.out.println(Micro1.getManufacturer());
        Micro1.setSize(1000);
        System.out.println(Micro1.getSize());
        Micro1.setIsWork(false);
        System.out.println(Micro1.getIsWork());*/

        /*
        object.Microwave Micro1 = new object.Microwave();
        Micro1.isWork = false;
        Micro1.manufacturer = "LG";
        Micro1.size = 400;
        Micro1.mode("Усиленный");
        Micro1.time(300);
        Micro1.onOrOff();
        System.out.println("Производитель: " + Micro1.manufacturer + "\n" + "Размеры: " + Micro1.size);*/
    }

    //Написать функцию в май классе, которая получает три параметра, если первый параметр больше второго = из первого вычитает второй. Если второй больше первого,
    // то вычитает из второго первый. И, полученное значение, умножает на третье и возвращает число.
  /*  public static int zadanie3 (int num1, int num2, int num3){
        int vichitanie1 = num1 - num2;
        int vichitanie2 = num2 - num1;
        int umnozenie1 = vichitanie1 * num3;
        int umnozenie2 = vichitanie2 * num3;
        if (num1 > num2) {
            return umnozenie1;
        } else {
            return umnozenie2;
        }
    } */

    public static int zadanie3 (int num1, int num2, int num3){
        if (num1 > num2) {
            return (num1 - num2)*num3;
        } else {
            return (num2 - num1)*num3;
        }
    }



    //метод, который возвращает большее число из двух
    public static int big(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    //метод, который возвращает сумму массива
    public static int sumMass(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        return sum;
    }

    //метод, который выводит на экран число в массиве, если оно не равно 25
    public static void vigo(int[] mass1) {
        for (int t : mass1) {
            while (t != 25) {
                System.out.println(t);
                break;
            }
        }
    }

    //метод, который выводит на экран ответ в зависимости от предоставленного числа
    public static void timeToDie(int minute) {
        switch (minute) {
            case 1:
                System.out.println("Одна минута до конца урока");
                break;
            case 5:
                System.out.println("Пять минут до конца урока");
                break;
            case 10:
                System.out.println("Десять минут до конца урока");
                break;
            default:
                System.out.println("Еще слишком рано");
                break;
        }
    }

    public static Serializable sumTwoChisel(int number1, int number2) {
        String sorry = "Числа не подходят";
        int sumTwoCh = number1 + number2;
        if (number1 > 2 && number2 > 0 && number2 < 100) {
            return sumTwoCh;
        } else {
            return sorry;
        }
    }

    public static int sumTwoChisel2(int number1, int number2) {
        int sumTwoCh = 0;
        if (number1 > 2 && number2 > 0 && number2 < 100) {
            sumTwoCh = number1 + number2;
            return sumTwoCh;
        } else {
            return 0;
        }
    }
}
