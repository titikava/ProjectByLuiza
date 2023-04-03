package flowersOOP;

public class MyClass {
    public static void main(String[] args) {
        Flower rose1 = new Rose();
        Flower carnation1 = new Carnation();
        Flower tulip1 = new Tulip();
        Flower chamomile1 = new Chamomile();
        rose1.price = 45.5;
        carnation1.price = 25.9;
        tulip1.price = 50;
        chamomile1.price = 5.2;
        double[] bouquet1 = {rose1.price, carnation1.price, tulip1.price, chamomile1.price};
        double[] bouquet2 = {chamomile1.price, chamomile1.price, chamomile1.price, chamomile1.price, chamomile1.price};
        double[] bouquet3 = {chamomile1.price, rose1.price, rose1.price, rose1.price, chamomile1.price, chamomile1.price, tulip1.price};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < bouquet1.length; i++) {
            sum1 = sum1 + 1;
        }
        for (int i = 0; i < bouquet2.length; i++) {
            sum2 = sum2 + 1;
        }
        for (int i = 0; i < bouquet3.length; i++) {
            sum3 = sum3 + 1;
        }
        System.out.println(sum1 + sum2 + sum3);

        double[][] bouquets = {{rose1.price, carnation1.price, tulip1.price, chamomile1.price}, {chamomile1.price, chamomile1.price, chamomile1.price, chamomile1.price, chamomile1.price}, {chamomile1.price, rose1.price, rose1.price, rose1.price, chamomile1.price, chamomile1.price, tulip1.price}};
        int sum = 0;
        for (int i = 0; i < bouquets.length; i++) {
            for (int j = 0; j < bouquets[i].length; j++) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    /*    Flower[] flowers = {rose1, carnation1, chamomile1, tulip1};
        System.out.println(bouquet1(flowers));*/
        System.out.println(Flower.sumFlower);
    }

  /*  public static double bouquet1(Flower[] flowers) {
        int priceSum = 0;
        for (Flower flower: flowers){
            priceSum += flower.price;
        }
        return priceSum;
    }*/

}
