package lessonOOP;

import uroki.Rank070423;

import java.util.Objects;

public class Person {
    String fullName;
    int age;
    int dnaCode;
    Rank070423 rank;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // если объект1 равен объекту 2 по двойному равно (т.е. сравнение ссылок), то возвращаем true
        if (o == null || getClass() != o.getClass()) return false; // если сравнивать с null или различные классы объекта 1 или объекта 2, то возвращаем false
        Person person = (Person) o;// переводим тип объекта с основоного Object в Person
        return age == person.age && Objects.equals(fullName, person.fullName) && dnaCode == person.dnaCode; // прописываем нужные нам сравнения
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }

    public Person(String f, int a) {
        this.age = a;
        this.fullName = f;
    }

    public Person() {

    }

    public Rank070423 getRank() {
        return rank;
    }

    public void setRank(Rank070423 rank) {
        this.rank = rank;
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
