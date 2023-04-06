package adminOOP;

public class Administrator extends Client {
    protected String surname;
    protected String name;
    protected int experience;
    protected int gratuity;
    protected int scandal;

    Administrator(String surname, String name, int experience) {
        this.surname = surname;
        this.name = name;
        this.experience = experience;
    }

    Administrator(String name, int experience, int gratuity, int scandal) {
        this.name = name;
        this.experience = experience;
        this.gratuity = gratuity;
        this.scandal = scandal;

    }

    Administrator(String surname, String name, int experience, int gratuity, int scandal) {
        this.surname = surname;
        this.name = name;
        this.experience = experience;
        this.gratuity = gratuity;
        this.scandal = scandal;
    }

    Administrator() {

    }

    public int getExperience() {
        return experience;
    }

    public int getGratuity() {
        return gratuity;
    }

    public int getScandal() {
        return scandal;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setExperience(int experience) {
        if (experience > 6) {
            this.experience = experience;
        } else {
            System.out.println("Мало опыта");
        }
    }

    public void setScandal(int scandal) {
        if (scandal < 10) {
            this.scandal = scandal;
        } else {
            System.out.println("Уволен");
        }
    }

    public void setGratuity(int gratuity) {
        this.gratuity = gratuity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
