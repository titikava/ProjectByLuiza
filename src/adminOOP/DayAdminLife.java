package adminOOP;

public class DayAdminLife {
    public static void main(String[] args) {
        Administrator admin1 = new Administrator("Петров", "Валерий", 8);
        admin1.setGratuity(50);
        Administrator admin2 = new Administrator();
        Administrator admin3 = new Administrator("Глеб", 7, 100, 3);
        Client client1 = new Client("Анна", "Дьякова", 24);
        Client client2 = new Client();
        Client client3 = new Client("Игорь", "+792045645645", "Male");
        System.out.println(Administrator.allScandal);
        client1.setEmail("bebra@mail.ru");
        client1.setGender("Female");
        client1.setSurname("Демьян");
        client1.setPhoneNumber("+79206666666");
        Client.sayMyName(client1.getName(), client1.getSurname());
        Client.yellAtTheAdmin(client1.getName(), client1.getSurname(), client1.getEmail());
        Client.getSomethingMoney(client1.getName(), admin1);
        Client.thanksAdmin(admin1);
        Administrator.welcome(client1);
        Administrator.regiserClient(client1, admin1);
        Administrator.screaming();
        Administrator.resultOfDay(admin1);
    }
}
