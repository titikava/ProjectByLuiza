package flowersOOP;

public class Bouquet1 extends Flower {

    public static void bouquet() {
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
}
