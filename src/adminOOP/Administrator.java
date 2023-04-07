package adminOOP;

import java.util.Arrays;
import java.util.Objects;

public class Administrator extends Client {
    protected String surname;
    protected String name;
    protected int experience;
    protected int gratuity;
    protected int scandal;
    static int allScandal;

    Administrator(String surname, String name, int experience) {
        this.surname = surname;
        this.name = name;
        this.experience = experience;
    }

    Administrator(String name, int experience, int gratuity, int scandal) {
        this.name = name;
        this.gratuity = gratuity;
        this.scandal = scandal;
        if (experience > 6) {
            this.experience = experience;
        } else {
            System.out.println("Мало опыта");
        }
        allScandal = scandal + scandal;
    }

    Administrator(String surname, String name, int experience, int gratuity, int scandal) {
        this.surname = surname;
        this.name = name;
        this.experience = experience;
        this.gratuity = gratuity;
        this.scandal = scandal;
        allScandal = scandal + scandal;
    }

    Administrator() {
    }

    public int getAllScandal(){
        return allScandal;
    }

    public int getExperience() {
        return experience;
    }

    public int getGratuity() {
        return gratuity;
    }

    public int getScandal() {
        return scandal;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setExperience(int experience) {
        if (experience > 6) {
            this.experience = experience;
        } else {
            System.out.println("Мало опыта");
        }
    }

    public void setScandal(int scandal) {
        if (scandal < 10) {
            this.scandal = scandal;
        } else {
            System.out.println("Уволен");
        }
    }

    public void setGratuity(int gratuity) {
        this.gratuity = gratuity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void welcome (Client client) {
        if (Objects.equals(client.getGender(), "Male")) {
            System.out.println("Добрый день господин " + client.getName() + " " + client.getSurname() + "!");
        } else {
            System.out.println("Добрый день госпожа " + client.getName() + " " + client.getSurname() + "!");
        }
    }

    public static void regiserClient (Client client, Administrator administrator) {
        if (client.getSurname().endsWith("ян")){
            System.out.println("Барев Дзез!");
        }
        System.out.println(administrator.getName() + " записывает:" + "\n" + "*Фамилия: " + client.getSurname() +
                "\n" + "*Имя: " + client.getName() + "\n" + "*Возраст: " + client.getAge() +
                "\n" + "*Номер телефона: " + client.getPhoneNumber() + "\n" + "*Email: " + client.getEmail());
    }

    public static void screaming () {
        String a = "Рады приветствовать в нашем уютном гнезде!";
        char[] b = a.toCharArray();
        for (char c : b) {
            System.out.print(c + "-");
        }
        System.out.println("\n");
    }

    public static void resultOfDay (Administrator a) {
        System.out.println(a.getName() + " " + a.getSurname() + "(Стаж - " + a.getExperience() + " лет)" +
                "\n" + "Поскандалил - " + a.getScandal() + " раз" + "\n" + "Получил чаевых в сумме: " + a.getGratuity());
    }
}
