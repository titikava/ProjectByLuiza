package lessonOOP;

public class Pear extends Fruit {
    final double PRICE = 30;
    public static double allPrice = 0;


    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Некорректный вес");
        }
    }

    @Override
    double price() {
        allPrice += getWeight() * PRICE;
        allFruitPrice += getWeight() * PRICE;
        return getWeight() * PRICE;
    }
}
