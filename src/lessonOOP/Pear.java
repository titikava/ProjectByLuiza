package lessonOOP;

public class Pear extends Fruit {
    final double PRICE = 30;
    public static double allPrice = 0;

    @Override
    double price(double weight) {
        allPrice += weight * PRICE;
        allFruitPrice += weight * PRICE;
        return weight * PRICE;
    }
}
