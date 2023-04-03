package lessonOOP;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Phone {
    private long number;
    private String model;
    private int weight;

    Phone(String model, long number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    Phone(String model, long number) {
        this.model = model;
        this.number = number;
    }

    Phone() {

    }

    public static void receiveCall(String name) {
        System.out.println("Звонит - " + name);
    }

    public static void receiveCall(String name, long number) {
        System.out.println(number + " " + name);
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else {
            System.out.println("Не существующая модель");
        }
    }

    public void setNumber(long number) {
        if (number != 0) {
            this.number = number;
        } else {
            System.out.println("Не существующий номер");
        }
    }

    public void setWeight(int weight) {
        if (weight != 0) {
            this.weight = weight;
        } else {
            System.out.println("Не существующий размер");
        }
    }

    public static void sendMassage(Long...longs) {
        Scanner key = new Scanner(System.in);
        long numbers = key.nextLong();
        for (int i = 0; i < numbers; i++) {
            System.out.println(numbers + " ");
        }
    }
}

/*
        Scanner key = new Scanner(System.in);
        long[] numb = new long[3];
        for (int i = 0; i < numb.length; i++) {
            numb[i] = key.nextLong();
        }
        System.out.println("Отправлено сообщение таким номерам: " + Arrays.toString(numb));
*/