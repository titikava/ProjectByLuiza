package adminOOP;

public class DayAdminLife {
    public static void main(String[] args) {
        Administrator admin1 = new Administrator("Петров", "Валерий", 8);
        Administrator admin2 = new Administrator();
        admin2.setName("Антон");
        admin2.setSurname("Авоська");
        admin2.setExperience(6);
        Administrator admin3 = new Administrator("Глеб");
        admin3.setSurname("Пурешье");
        Client client1 = new Client("Анна", "Дьякова", 24);
        client1.setEmail("bebra@mail.ru");
        client1.setGender("female");
        client1.setPhoneNumber("+79206666666");
        Client client2 = new Client();
        client2.setAge(45);
        client2.setGender("male");
        client2.setSurname("Колодезь");
        client2.setEmail("kakaha@be.fu");
        client2.setName("Валерий");
        client2.setPhoneNumber("+7954588465");
        Client client3 = new Client("Игорь", "+792045645645", "female");
        client3.setSurname("Полякова");
        client3.setAge(75);
        client3.setEmail("norm@email.com");
        System.out.println("Общее количество скандалов за день: " + Administrator.allScandal);
        client1.sayMyName(client1);
        client2.yellAtTheAdmin(client2, admin1);
        client1.yellAtTheAdmin(client1, admin2);
        client3.yellAtTheAdmin(client3, admin1);
        client1.getSomethingMoney(client1.getName(), admin1, 50);
        client2.getSomethingMoney(client2.getName(), admin2, 100);
        client3.getSomethingMoney(client3.getName(), admin1, 100);
        client1.thanksAdmin(admin1);
        client2.thanksAdmin(admin3);
        admin1.welcome(client1);
        admin1.regiserClient(client1);
        admin3.screaming();
        admin2.resultOfDay(admin1);
    }
}
//убрать статик
//разобраться со скандалами
//разобраться с чаевыми по типу скандалов