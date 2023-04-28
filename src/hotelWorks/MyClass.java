package hotelWorks;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {
        Admin admin1 = new Admin("Геворг", "Геворгий", 5);
        Maids maids1 = new Maids("Алиса", 22, new int[]{5, 6, 7});
        //maids1.maidsDetails();
        admin1.setSalary(3100);
        System.out.println(admin1.getSalary());
        System.out.println(maids1.getSalary());
        admin1.rooms = maids1.getListOfRooms();
        int[] rooms1 = {22, 65, 34};
        admin1.setRooms(rooms1);
        maids1.setListOfRooms(admin1.rooms);
        System.out.println(Arrays.toString(maids1.getListOfRooms()));
        Maids maids2 = new Maids("Варвара", 59, new int[]{8, 9, 10});
        // maids2.setName("Вельзевул");

    }
}


//изменить переменные на protected
//в классах наследниках изменить getName на name и тому подобные штуки
//в MyClass использовать геттеры сеттеры
//написать с использованием enum