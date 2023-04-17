package hotelWorks;

public class MyClass {

    public static void main(String[] args) {
        Admin admin1 = new Admin("Геворг", "Геворгий", 25000, 5);
        Maids maids1 = new Maids("Алиса", 22, new int[]{5, 6, 7});
        maids1.maidsDetails();
        Maids maids2 = new Maids("Варвара", 59, new int[]{8, 9, 10});
    }
}
