package lesson;

public class Men030323 {
    public static int COUNT = 0;
    public static final double PI = 3.14;
    //Статичная не относиться к объекту, а относится к классу в целом.
    // Ее можно вызывать без объявления объекта класса.
    // final - для объявления констант. Ее нельзя изменить.
    // Пакеты используются для избежания конфликта имен и для управления доступом к классам.
    // Так же пакет может быть определен в виде собранной группы классов похожего типа.


    public Men030323(){
        COUNT++;
    }

    public static void bla(){
        System.out.println("bla");

    }




}