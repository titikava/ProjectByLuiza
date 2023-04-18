package hotelWorks;

import java.util.Arrays;

public class Maids extends HotelWorks {
    private int age;
    protected int[] listOfRooms;

    Maids(String name, int age, int[] listOfRooms) {
        this.setName(name);
        if (age < 57) this.age = age;
        else System.out.println("Вы старушка, милочка");
        this.listOfRooms = listOfRooms;
        this.salary = 35000;
    }

    Maids(){
        this.salary = 35000;
    }

    public int getAge() {
        return age;
    }

    public int[] getListOfRooms() {
        return listOfRooms;
    }

    public void setSalary(int salary) {
        if (salary == 35000) this.salary = salary;
        else System.out.println("Ни больше, ни меньше");
    }

    public void setListOfRooms(int[] listOfRooms){
        this.listOfRooms = listOfRooms;
    }

    @Override
    void introduceYourself() {
        System.out.println("Привет! Меня зовут - " + getName());
    }

    public void setAge(int age) {
            if (age < 57) this.age = age;
        else System.out.println("Вы старушка, милочка");
    }

    public void maidsDetails() {
        System.out.println("Комнаты уборки - " + Arrays.toString(getListOfRooms()) + "\n"
                + "Возраст сотрудника - " + getAge() + "\n" + "Имя сотрудника - " + getName());
    }
}
