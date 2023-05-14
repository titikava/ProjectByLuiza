package hotelWorks;

import uroki.Rank070423;

import java.util.Arrays;

public class RestaurantEmployees extends HotelWorks {
    public enum Position
    {
        CHEF, SUCHEF, WAITER, DISHWASHER
    }

    Position position;

    public Position getPosition() {
        return position;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "А у нас вот такие должности имеются - " + Arrays.toString(RestaurantEmployees.Position.values());
    }

    @Override
    protected void introduceYourself() {
        System.out.println("Я обычный работяга, че надо?");
    }

    public void cooking(String mail) {
        System.out.println("Кухня готовит блюдо - " + mail);
    }
}
