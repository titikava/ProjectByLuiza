package adminOOP;

public class MyClass {
    public static void main (String[] args) {
        Administrator admin1 = new Administrator("Петров", "Валерий", 8);
        admin1.setGratuity(50);
        Client client1 = new Client("Анна", "Дьякова", 24);
        client1.setEmail("bebra@mail.ru");
        Client.sayMyName(client1.getName(), client1.getSurname());
        Client.yellAtTheAdmin(client1.getName(), client1.getSurname(), client1.getEmail());
        Client.getSomethingMoney(client1.getName(), admin1);
        Client.thanksAdmin(admin1);
    }

}
