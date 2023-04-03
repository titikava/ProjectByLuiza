package lessonOOP;

public abstract class Fruit {
    double weight;
    public static double allFruitPrice = 0;

    public static void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract double price(double weight);


}
