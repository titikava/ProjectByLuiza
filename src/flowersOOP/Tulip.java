package flowersOOP;

public class Tulip extends Flower {
    final double price = 5;
    static int quantity = 0;

    public double getPrice(){
        return price;
    }

    Tulip() {
        quantity++;
    }
}
