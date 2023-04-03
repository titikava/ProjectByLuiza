package lessonOOP;

public class Apricot extends Fruit{
    @Override
    double price(double weight) {
        double price = 40;
        return weight * price;
    }
}
