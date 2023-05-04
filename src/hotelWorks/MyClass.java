package hotelWorks;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {
        Administrator admin1 = new Administrator("Геворг", "Геворгий", 5);
//        Maids maids1 = new Maids("Алиса", 22, new int[]{5, 6, 7});
//        maids1.maidsDetails();
//        admin1.setSalary(3100);
//        System.out.println(admin1.getSalary());
//        System.out.println(maids1.getSalary());
//        admin1.rooms = maids1.getListOfRooms();
//        int[] rooms1 = {22, 65, 34};
//        admin1.setRooms(rooms1);
//        maids1.setListOfRooms(admin1.rooms);
//        System.out.println(Arrays.toString(maids1.getListOfRooms()));
//        Maids maids2 = new Maids("Варвара", 59, new int[]{8, 9, 10});
//        maids2.setName("Вельзевул");
        RestaurantEmployees employees1 = new RestaurantEmployees();
        employees1.setPosition(RestaurantEmployees.Position.CHEF);
        System.out.println(employees1.getPosition());
        admin1.setRestaurantEmployeesSalary(employees1);
        System.out.println(employees1.getSalary());
    }
}


//изменить переменные на protected - done
//в классах наследниках изменить getName на name и тому подобные штуки - done
//в MyClass использовать геттеры сеттеры - ponyatno
//написать с использованием enum