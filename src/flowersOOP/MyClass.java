package flowersOOP;

public class MyClass {
    public static void main(String[] args) {
        bouquet1();
        bouquet2();
        bouquet3();
        System.out.println("Всего продано - " + Flower.sumFlower + " цветка");
        System.out.println("Из которых роз - " + Rose.quantity + ", тюльпанов - " + Tulip.quantity + ", гвоздик - " +
                Carnation.quantity + ", ромашек - " + Chamomile.quantity);

    }

     public static void bouquet1() {
        Tulip tulip1 = new Tulip();
        Tulip tulip2 = new Tulip();
        Tulip tulip3 = new Tulip();
        Rose rose1 = new Rose();
        Rose rose2 = new Rose();
        Rose rose3 = new Rose();
        Carnation carnation1 = new Carnation();
        Chamomile chamomile1 = new Chamomile();
        System.out.println("Ваш букет стоит: " + (tulip1.price + tulip2.price + tulip3.price + rose1.price + rose2.price + rose3.price
                + carnation1.price + chamomile1.price) + " рублей.");
    }

    public static void bouquet2() {
        Tulip tulip1 = new Tulip();
        Tulip tulip2 = new Tulip();
        Rose rose1 = new Rose();
        Rose rose2 = new Rose();
        Rose rose3 = new Rose();
        Rose rose4 = new Rose();
        Carnation carnation1 = new Carnation();
        Carnation carnation2 = new Carnation();
        Carnation carnation3 = new Carnation();
        Chamomile chamomile1 = new Chamomile();
        System.out.println("Ваш букет стоит: " + (tulip1.price + tulip2.price + rose1.price + rose2.price + rose3.price
                + rose4.price + carnation1.price + carnation2.price + carnation3.price + chamomile1.price) + " рублей.");
    }

    public static void bouquet3() {
        Tulip tulip1 = new Tulip();
        Rose rose1 = new Rose();
        Carnation carnation1 = new Carnation();
        Carnation carnation2 = new Carnation();
        Carnation carnation3 = new Carnation();
        Chamomile chamomile1 = new Chamomile();
        System.out.println("Ваш букет стоит: " + (tulip1.price + rose1.price
                + carnation1.price + carnation2.price + carnation3.price + chamomile1.price) + " рублей.");
    }

  /*  public static double bouquet1(Flower[] flowers) {
        int priceSum = 0;
        for (Flower flower: flowers){
            priceSum += flower.price;
        }
        return priceSum;
    }*/

}
