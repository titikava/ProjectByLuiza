package hotelWorks;

import hotelWorksClient.Client;

public class MyClass {

    public static void main(String[] args) {
        Maids maids1 = new Maids("Юлия", 29, new int[]{1, 5, 6});
        Maids maids2 = new Maids("Виктория", 20, new int[]{2, 3, 4});
        Administrator administrator1 = new Administrator("Грегор", "Грегорович", 8, maids1, maids2);
        Maids maids3 = new Maids("Наталья", 29, new int[]{7, 8, 9});
        Maids maids4 = new Maids("Анна", 20, new int[]{150, 151, 152});
        Administrator administrator2 = new Administrator("Шмегор", "Шмегорович", 7, maids3, maids4);

        administrator1.assignRoomsToMaids(new int[]{100, 101, 102}, new int[]{103, 104, 15});
        System.out.println(maids1.toString());
        System.out.println(maids2);
        maids3.introduceYourself();

        RestaurantEmployees chef = new RestaurantEmployees();
        chef.setPosition(RestaurantEmployees.Position.CHEF);
        chef.setSalary(70000);
        RestaurantEmployees suchef = new RestaurantEmployees();
        suchef.setPosition(RestaurantEmployees.Position.SUCHEF);
        RestaurantEmployees waiter1 = new RestaurantEmployees();
        waiter1.setPosition(RestaurantEmployees.Position.WAITER);
        RestaurantEmployees waiter2 = new RestaurantEmployees();
        waiter2.setPosition(RestaurantEmployees.Position.WAITER);
        RestaurantEmployees dishwasher = new RestaurantEmployees();
        dishwasher.setPosition(RestaurantEmployees.Position.DISHWASHER);
        administrator1.setRestaurantEmployeesSalary(chef);
        System.out.println(chef.getSalary());

        Client client1 = new Client("Валерий", "Валерьевич", 20);
        client1.orderMailOfAdmin(administrator1, "Бургер");


    }
}

//в работниках ресторана переопределить toString используя атрибуты родительского класса + прописать конструктор с параметрами,
//что бы можно было вывести их данные на экран