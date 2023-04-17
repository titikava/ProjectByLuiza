package hotelWorks;

public class Admin extends HotelWorks {

    final int SALARY = 50000;

    Admin(String name, String surname, int salary, int experience) {
        this.setName(name);
        this.setExperience(experience);
        this.setSurname(surname);
        this.setSalary(salary);
    }

    Admin(String name, int experience) {
        this.setName(name);
        this.setExperience(experience);
    }

    @Override
    void introduceYourself() {
        System.out.println("Привет! Меня зовут - " + getName());
        praiseTheHotel();
    }
}
