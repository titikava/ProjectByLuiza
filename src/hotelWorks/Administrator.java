package hotelWorks;

import hotelWorksClient.Client;

import static hotelWorks.RestaurantEmployees.Position.*;

public class Administrator extends HotelWorks {

    protected int gratuity;
    protected int scandal = 0;
    public static int allScandal;
    protected int[] rooms = new int[3];
    protected Maids maids1;
    protected Maids maids2;

    Administrator(String name, String surname, int experience, Maids maids1, Maids maids2) {
        this.setName(name);
        this.setExperience(experience);
        this.setSurname(surname);
        this.salary = 250000;
        this.maids1 = new Maids();
        this.maids2 = new Maids();
    }

    Administrator(String name, int experience, Maids maids1, Maids maids2) {
        this.setName(name);
        this.setExperience(experience);
        this.salary = 250000;
        this.maids1 = new Maids();
        this.maids2 = new Maids();
    }

    Administrator(Maids maids1, Maids maids2) {
        this.maids1 = new Maids();
        this.maids2 = new Maids();
        this.salary = 250000;
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
            allScandal = allScandal + scandal;
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

    public void setRooms(int[] rooms) {
        this.rooms = rooms;
    }

    public void setSalary(int salary) {
        if (salary == 250000) this.salary = salary;
        else System.out.println("Ни больше, ни меньше");
    }

    @Override
    protected void introduceYourself() {
        System.out.println("Привет! Меня зовут - " + name);
        praiseTheHotel();
    }

    public void welcome(Client client) {
        if (client.getGender().equals("male")) {
            System.out.println("Добрый день господин " + client.name + " " + client.surname + "!");
        } else {
            System.out.println("Добрый день госпожа " + client.name + " " + client.surname + "!");
        }
    }

    public void regiserClient(Client client) {
        if (client.surname.endsWith("ян")) {
            System.out.println("Барев Дзез!");
        }
        System.out.println(name + " записывает:" + "\n" + "*Фамилия: " + client.surname +
                "\n" + "*Имя: " + client.name + "\n" + "*Возраст: " + client.getAge() +
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
        System.out.println(a.name + " " + a.surname + "(Стаж - " + a.experience + " лет)" +
                "\n" + "Поскандалил - " + a.scandal + " раз" + "\n" + "Получил чаевых в сумме: " + a.gratuity);
    }

    public void assignRoomsToMaids(Administrator administrator, int[] mass1, int[] mass2) {
        maids1.setListOfRooms(mass1);
        maids2.setListOfRooms(mass2);
    }

    public void setRestaurantEmployeesSalary(RestaurantEmployees restaurantEmployees) {
        if (CHEF.equals(restaurantEmployees.position)) {
            restaurantEmployees.setSalary(150000);
        } else if (SUCHEF.equals(restaurantEmployees.position)) {
            restaurantEmployees.setSalary(120000);
        } else if (WAITER.equals(restaurantEmployees.position)) {
            restaurantEmployees.setSalary(75000);
        } else if (DISHWASHER.equals(restaurantEmployees.position)) {
            restaurantEmployees.setSalary(45000);
        } else {
            throw new IllegalArgumentException("Invalid restaurant employees position");
        }
    }

    public void orderMail(RestaurantEmployees employees, String mail) {
        System.out.println("Привет голубчик " + employees.name + "! Это " + name + ". Приготовь пожалуйста " + mail);
        System.out.println(name + " заказал блюдо - " + mail + " на кухне");
        employees.cooking(mail);
    }
}
