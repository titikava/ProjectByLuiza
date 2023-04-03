package zadachnik;

import java.util.Arrays;

public class Generate250_746 {
    static final int min = 250;
    static final int max = 746;
    static int maxMin = random(min, max);

    public static void main(String[] args) {
        maxMinFunction();
    }

    public static int random(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static int max(int maxMin) {
        int three = maxMin % 10;
        int two = (maxMin % 100) / 10;
        int one = maxMin / 100;
        int[] maxMinMass = {one, two, three};
        Arrays.stream(maxMinMass).max();
       // Arrays.sort(maxMinMass);
        return Arrays.stream(maxMinMass).max().getAsInt();
    }


    public static int min(int maxMin) {
        int three = maxMin % 10;
        int two = (maxMin % 100) / 10;
        int one = maxMin / 100;
        int[] maxMinMass = {one, two, three};
        Arrays.sort(maxMinMass);
        return maxMinMass[0];
    }

    public static void maxMinFunction() {
        System.out.println("Рандомное число: " + maxMin);
        System.out.println("Наименьшее число: " + min(maxMin) + "\n" + "Наибольшее число: " + (max(maxMin)));
        if (min(maxMin) == max(maxMin)) {
            System.out.println("Числа одинаковы");
        } else {
            System.out.println("Числа разные");
        }
    }
}
