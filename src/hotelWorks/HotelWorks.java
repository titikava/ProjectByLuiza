package hotelWorks;

import java.util.Objects;

public abstract class HotelWorks {
    private String name;
    private String surname;
    private int salary;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name != null) this.name = name;
       else System.out.println("Пустота не есть имя");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null) this.surname = surname;
        else System.out.println("Пустота не есть фамилия");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    abstract void introduceYourself();

    void praiseTheHotel() {
        System.out.println("Отель прекрасен, спору нет");
    }

}
