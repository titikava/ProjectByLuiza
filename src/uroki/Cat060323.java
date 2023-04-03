package uroki;

public class Cat060323 extends Animal060323{
    private String name; //Могут создать с пустым именем, могут еще чет
    private int age; //Могут минусовой возраст баххнуть
    private int weight; //Могут минусовой вес баххнуть, если будет public
    //Создаем сеттеры и свои условия
    //

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    public void makeSound2() {
        System.out.println("МЯУ МАЗАФАКА");
    }


   /* Cat060323(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }*/
}
