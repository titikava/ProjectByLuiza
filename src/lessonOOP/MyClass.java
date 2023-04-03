package lessonOOP;


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

        Fruit apple1 = new Apple();
        Pear pear1 = new Pear();
        Pear pear2 = new Pear();
        Fruit apricot1 = new Apricot();
        System.out.println(pear1.price(2));
        System.out.println(pear2.price(1));
        System.out.println(Pear.allPrice);
        System.out.println(apple1.price(4));
        System.out.println(Fruit.allFruitPrice);
       /* System.out.println("Всего продано на сумму: " + (apple1.price(1.25) + pear1.price(5) + apricot1.price(5.74)));
        System.out.println("Всего продано яблок на сумму: " + apple1.price(1.25));
        System.out.println("Всего продано груш на сумму: " + pear1.price(5));
        System.out.println("Всего продано абрикос на сумму: " + apricot1.price(5.74));*/
    }
}