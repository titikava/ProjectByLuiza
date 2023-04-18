package hotelWorks;

import java.util.Arrays;

public class RestaurantEmployees extends HotelWorks{
    private final String[] position = {"Шеф", "Су-шеф", "Официант", "Посудомойщица"};

    public String[] getPosition() {
        return position;
    }

    public void positionString() {
        System.out.println(Arrays.toString(getPosition()));
    }

    @Override
    void introduceYourself() {
        System.out.println("Я обычный работяга, че надо?");
    }
}
