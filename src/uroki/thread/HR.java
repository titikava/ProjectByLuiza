package uroki.thread;

public class HR {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        PeopleQueue peopleQueue1 = new PeopleQueue("Гусь", "Лодочник", "Кавалер", "Микрон");
        PeopleQueue peopleQueue2 = new PeopleQueue("Дольчелита", "Клава", "Бусинка", "Картоха");
        System.out.println("Начали");
        peopleQueue1.start();
        peopleQueue2.start();
        System.out.println("Main thread finish");
    }
}
