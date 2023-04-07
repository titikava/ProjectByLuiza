package adminOOP;

public class MyClass {
    public static void main (String[] args) {
        Administrator admin1 = new Administrator("Петров", "Валерий", 8);
        admin1.setGratuity(50);
        Client client1 = new Client("Анна", "Дьякова", 24);
        client1.setEmail("bebra@mail.ru");
        client1.setGender("Female");
        client1.setSurname("Демьян");
        client1.setPhoneNumber("+79206666666");
     /*   Client.sayMyName(client1.getName(), client1.getSurname());
        Client.yellAtTheAdmin(client1.getName(), client1.getSurname(), client1.getEmail());
        Client.getSomethingMoney(client1.getName(), admin1);
        Client.thanksAdmin(admin1);
        Administrator.welcome(client1);
        Administrator.regiserClient(client1, admin1);*/
        Administrator.screaming();
        Administrator.resultOfDay(admin1);
    }

}
