package hotelWorks;

public class Admin extends HotelWorks {

    protected int[] rooms = new int[3];

    Admin(String name, String surname, int experience) {
        this.setName(name);
        this.setExperience(experience);
        this.setSurname(surname);
        this.salary = 250000;
    }

    Admin(String name, int experience) {
        this.setName(name);
        this.setExperience(experience);
        this.salary = 250000;
    }

    Admin() {
        this.salary = 250000;
    }

    public void setRooms(int[] rooms){
        this.rooms = rooms;
    }

    public void setSalary(int salary) {
        if (salary == 250000) this.salary = salary;
        else System.out.println("Ни больше, ни меньше");
    }

    @Override
    void introduceYourself() {
        System.out.println("Привет! Меня зовут - " + getName());
        praiseTheHotel();
    }
}
