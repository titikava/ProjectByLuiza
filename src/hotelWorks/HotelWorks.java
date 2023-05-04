package hotelWorks;

public abstract class HotelWorks {
    protected String name;
    protected String surname;
    protected int salary;
    protected int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name.equals("Вельзевул")) System.out.println("Пошел в жопу Вельзевул");
       else this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.equals("Вельзевулович")) System.out.println("Пошел в жопу Вельзевул");
        else this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
       /*if (salary > 0) this.salary = salary;
       else System.out.println("За бесплатно");*/
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        switch (experience) {
            case 0:
                this.experience = experience;
                System.out.println("Не так уж и много");
            case 1, 2, 3, 4:
                this.experience = experience;
                System.out.println("Не так уж и много, но пойдет");
            default:
                this.experience = experience;
                System.out.println("Такие люди нам пригодятся");
        }
    }


    protected abstract void introduceYourself();

    protected void praiseTheHotel() {
        System.out.println("Отель прекрасен, спору нет");
    }

}
