package lessonOOP;

public class Apple extends Fruit {
    final double PRICE = 2;
    public static double allPrice = 0;

    @Override
    double price(double weight) {
        allPrice += weight * PRICE;
        allFruitPrice += weight * PRICE;
        return weight * PRICE;
    }
}
