package adminOOP;

import java.util.Objects;

public class Administrator {
    private String surname;
    private String name;
    private int experience;
    private int gratuity;
    private int scandal = 0;
    static int allScandal;

    Administrator(String surname, String name, int experience) {
        this.surname = surname;
        this.name = name;
        if (experience > 6) {
            this.experience = experience;
        } else {
            System.out.println("Мало опыта");
        }
    }

    Administrator(String c){
        this.name = c;
    }

    Administrator() {

    }

    public int getAllScandal() {
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
            allScandal = Administrator.allScandal + scandal;
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

    public void welcome(Client client) {
        if (client.getGender().equals("male")) {
            System.out.println("Добрый день господин " + client.getName() + " " + client.getSurname() + "!");
        } else {
            System.out.println("Добрый день госпожа " + client.getName() + " " + client.getSurname() + "!");
        }
    }

    public void regiserClient(Client client) {
        if (client.getSurname().endsWith("ян")) {
            System.out.println("Барев Дзез!");
        }
        System.out.println(name + " записывает:" + "\n" + "*Фамилия: " + client.getSurname() +
                "\n" + "*Имя: " + client.getName() + "\n" + "*Возраст: " + client.getAge() +
                "\n" + "*Номер телефона: " + client.getPhoneNumber() + "\n" + "*Email: " + client.getEmail());
    }

    public void screaming() {
        String a = "Рады приветствовать в нашем уютном гнезде!";
        char[] b = a.toCharArray();
        for (char c : b) {
            System.out.print(c + "-");
        }
        System.out.println("\n");
    }

    public void resultOfDay(Administrator a) {
        System.out.println(a.getName() + " " + a.getSurname() + "(Стаж - " + a.getExperience() + " лет)" +
                "\n" + "Поскандалил - " + a.getScandal() + " раз" + "\n" + "Получил чаевых в сумме: " + a.getGratuity());
    }
}
