package adminOOP;

import java.util.Arrays;
import java.util.Locale;

public class Client {
    protected String name;
    protected String surname;
    protected int age;
    protected String gender;
    protected String email;
    protected String phoneNumber;

    Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Client(String surname, String email) {
        this.surname = surname;
        this.email = email;
    }

    Client(String name, String phoneNumber, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
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

    public void setAge(int a) {
        if (a > 17 && a < 76) {
            this.age = a;
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
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void sayMyName(String name, String surname) {
        name = name.concat(" " + surname);
        System.out.println(name);
    }

    public static void yellAtTheAdmin(String name, String surname, String email) {
        String c = "Я - " + name.concat(" " + surname) + "! Как вы могли неправильно записать мои данные?! Мой " +
                "имейл: " + email;
        System.out.println(c.toUpperCase(Locale.ROOT));
    }

    public static void getSomethingMoney(String name, Administrator administrator) {
        System.out.println(name + " дал чаевые " + administrator.getName() + " в размере - " + administrator.getGratuity()
        + " долларов");
    }

    public static void thanksAdmin(Administrator administrator) {
        String c = "Спасибо большое! " + administrator.getName() + " . Все было супер!";
        c = c.replace('с', 'ш').toLowerCase(Locale.ROOT);
       // c = c.replace('C', 'Ш');
        System.out.println(c);
        }
}
