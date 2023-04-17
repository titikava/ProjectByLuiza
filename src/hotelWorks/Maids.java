package hotelWorks;

import java.util.Arrays;

public class Maids extends HotelWorks {
    private int age;
    private int[] listOfRooms;

    Maids(String name, int age, int[] listOfRooms) {
        this.setName(name);
        if (age < 57) this.age = age;
        else System.out.println("Вы старушка, милочка");
        this.listOfRooms = listOfRooms;
    }

    public int getAge() {
        return age;
    }

    public int[] getListOfRooms() {
        return listOfRooms;
    }

    @Override
    void introduceYourself() {
        System.out.println("Привет! Меня зовут - " + getName());
    }

    public void setAge(int age) {
            if (age < 57) this.age = age;
        else System.out.println("Вы старушка, милочка");
    }

    public void setListOfRooms(int[] listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    public void maidsDetails() {
        System.out.println("Комнаты уборки - " + Arrays.toString(getListOfRooms()) + "\n"
                + "Возраст сотрудника - " + getAge() + "\n" + "Имя сотрудника - " + getName());
    }
}
