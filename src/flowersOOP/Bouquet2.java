package flowersOOP;

public class Bouquet2 extends Flower {

    public static void bouquet() {
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
}