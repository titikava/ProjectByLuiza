package uroki;
import object.*;
public class MyClass {



    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static void sayHello2(String fraza) {
        System.out.println("Привет " + fraza);

    }

    public static int chislo() {
        return 5;
    }

    public static void main(String[] args) {
        Kletka kletka1 = new Kletka();
        kletka1.setIsOpen(true);
        kletka1.setColor("Blue");
        Kletka kletka2 = new Kletka();
        kletka2.setHight(158);
        kletka2.sayHello("фывфы", "ыва@sdsa.ru");
        Kletka.toBe("Valera");
        Kletka kletka3 = new Kletka("Grey");
        System.out.println(kletka3.getColor());
        String kletka4Color = "Dark";
        Kletka kletka4 = new Kletka(kletka4Color);

    }

}


//        int a = 12;
//        int b = 36;
//        int sumValue = sum(a, b);
//        System.out.println(sumValue);



