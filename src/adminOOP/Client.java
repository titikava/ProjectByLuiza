package adminOOP;

import java.util.Locale;

public class Client {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;

    Client(String name, String surname, int age) {
        switch (name) {
            case "Валерий", "Игорь", "Александра", "Светлана", "Анна", "Джузеппе" -> this.name = name;
            default -> System.out.println("Простите, но ваше имя не подходит нам :(");
        }
        this.surname = surname;
        if (age > 17 && age < 76) {
            this.age = age;
        } else {
            System.out.println("Ваш возраст не подходит, сорян");
        }
    }

    Client(String surname, String email) {
        this.surname = surname;
        this.email = email;
    }

    Client(String name, String phoneNumber, String gender) {
        switch (name) {
            case "Валерий", "Игорь", "Александра", "Светлана", "Анна", "Джузеппе" -> this.name = name;
            default -> System.out.println("Простите, но ваше имя не подходит нам :(");
        }
        this.phoneNumber = phoneNumber;
        if (gender.toLowerCase(Locale.ROOT).equals("female") || gender.toLowerCase(Locale.ROOT).equals("male")) {
            this.gender = gender;
        } else {
            System.out.println("Не существующий гендер");
        }
    }

    Client() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String n) {
        switch (n) {
            case "Валерий", "Игорь", "Александра", "Светлана", "Анна", "Джузеппе" -> this.name = n;
            default -> System.out.println("Простите, но ваше имя не подходит нам :(");
        }
    }

    public void setAge(int age) {
        if (age > 17 && age < 76) {
            this.age = age;
        } else {
            System.out.println("Ваш возраст не подходит, сорян");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        if (gender.toLowerCase(Locale.ROOT).equals("female") || gender.toLowerCase(Locale.ROOT).equals("male")) {
            this.gender = gender;
        } else {
            System.out.println("Не существующий гендер");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void sayMyName(Client client) {
        name = name.concat(" " + surname);
        System.out.println(name);
    }

    public void yellAtTheAdmin(Client client, Administrator admin) {
        String c = "Я - " + name.concat(" " + surname) + "! Как вы могли неправильно записать мои данные?! Мой " +
                "имейл: " + email;
        admin.setScandal(admin.getScandal()+1);
        Administrator.allScandal++;
        System.out.println(c.toUpperCase(Locale.ROOT));
    }

    public void getSomethingMoney(String name, Administrator administrator, int cash) {
        administrator.setGratuity(cash);
        System.out.println(name + " дал чаевые " + administrator.getName() + " в размере - " + cash
                + " долларов");
    }

    public void thanksAdmin(Administrator administrator) {
        String c = "Спасибо большое! " + administrator.getName() + ". Все было супер!";
        c = c.replaceAll("[Сс]", "ш");
        System.out.println(c);
    }
}
