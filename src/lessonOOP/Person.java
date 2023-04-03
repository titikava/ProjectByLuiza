package lessonOOP;

public class Person {
    String fullName;
    int age;

    Person(String f, int a) {
        this.age = a;
        this.fullName = f;
    }

    Person() {

    }

    public void talk() {
        if (fullName != null) {
            System.out.println(fullName + " говорит");
        } else {
            System.out.println("Никто не говорит");
        }
    }

    public void move() {
        if (fullName != null) {
            System.out.println(fullName + " ходит");
        } else {
            System.out.println("Никто не ходит");
        }
    }
}
