package flowersOOP;

public class Bouquet3 extends Flower {

    public static void bouquet() {
        Tulip tulip1 = new Tulip();
        Rose rose1 = new Rose();
        Carnation carnation1 = new Carnation();
        Carnation carnation2 = new Carnation();
        Carnation carnation3 = new Carnation();
        Chamomile chamomile1 = new Chamomile();
        System.out.println("Ваш букет стоит: " + (tulip1.price + rose1.price
                + carnation1.price + carnation2.price + carnation3.price + chamomile1.price) + " рублей." + "\n" + "Всего продано - " +
                (Tulip.quantityTulip + Rose.quantity + Carnation.quantity + Chamomile.quantity) + " цветов.");
    }
}
