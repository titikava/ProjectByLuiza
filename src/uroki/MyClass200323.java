package uroki;

/*
Привидение типов
Присваивание значения переменной одного типа к переменной другого типа называется привидением типа
Два типа привидения - восходящее и нисходящее
Вы можете привести экземпляр подкласса к его суперклассу. - Восходящее
Приведение объекта суперкласса к его подклассу называется нисходящее
Восходящее приведение является автоматическим, потому что никогда не можжет потерпеть неудачу
Но если у вас есть группа различных клаассов Animal и выхотите нисходяще привести их всех к классу Cat, то будет шанс, что
некоторые из этих классов Animal являются в действительности классами Dog и процесс обернется ошибкой
*/

import uroki.newPackage.Dog060323;

public class MyClass200323 {
    public static void main(String[] args) {
        int a = (int) 3.14;
        double b = 42.57;
        int c = (int) b;
        Animal060323 animal1 = new Cat060323(); // восходящее
        Animal060323 animal2 = new Dog100323();
        Animal060323 animal3 = new Animal060323();
        ((Cat060323) animal1).makeSound2();
        // animal1.makeSound();// нисходящее
        // ((Cat060323)animal2).makeSound(); // нисходящее
        Cat060323 cat = new Cat060323();
        //((Animal060323)cat).makeSound();
        cat.eat();  // восходящее
    }

}