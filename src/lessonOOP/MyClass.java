package lessonOOP;


import flowersOOP.Tulip;

public class MyClass {

    public static void main(String[] args) {

        // -------------------------PHONE---------------------------------------------
    /*    Phone samsung = new Phone("A32", 4444444, 40);
        Phone iPhone = new Phone("11", 5555555);
        Phone nokia = new Phone();
        nokia.setWeight(35);
        nokia.setModel("BMP");
        nokia.setNumber(666666);
        System.out.println(samsung.getNumber());
        Phone.receiveCall("Igor");
        Phone.receiveCall("Gleb", nokia.getNumber());
        Phone.sendMassage();*/


        // -------------------------PERSON---------------------------------------------
    /*
        Person per1 = new Person();
        Person per2 = new Person("Andrey", 22);
        per1.move();
        per2.talk();
        */

        // -------------------------FRUIT---------------------------------------------

        Apple apple1 = new Apple();
        apple1.setWeight(4);
        Pear pear1 = new Pear();
        pear1.setWeight(1);
        Pear pear2 = new Pear();
        pear2.setWeight(4);
        Apricot apricot1 = new Apricot();
        apricot1.setWeight(2);
        System.out.print(pear1.price() + " ;" + pear2.price() + " ;" + apple1.price() + " ;" + apricot1.price() + "\n");
        System.out.println("Sale Pear: " + Pear.allPrice);
        System.out.println("Sale all fruit: " + Fruit.allFruitPrice);
       /* System.out.println("Всего продано на сумму: " + (apple1.price(1.25) + pear1.price(5) + apricot1.price(5.74)));
        System.out.println("Всего продано яблок на сумму: " + apple1.price(1.25));
        System.out.println("Всего продано груш на сумму: " + pear1.price(5));
        System.out.println("Всего продано абрикос на сумму: " + apricot1.price(5.74));*/
    }
}