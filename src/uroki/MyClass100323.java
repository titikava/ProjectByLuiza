package uroki;

/*полиморфизм (перевод - много форм) ссылающийся на идею "наличия множества форм" возникает при наличии иерархов классов, связанных друг с другом наследованием
 * Вызов метода произведет различное выполнение в зависимости от типа объекта.
 * Полиморфизм - это возможность применения одноименных методов с одинаковыми или различными наборами параметров. В одном классе или
 * в группе классов, связанных отношением наследования
 * Переопределение метода. Подкласс может определить поведение специфичное к типу подкласса,
 * значит что подкласс может реализовать метод родительского класса, основанный на его требованиях. Эта особенность известна как
 * переопределение методов.
 * Правила переопределения методов (@Override):
 * 1) Должны иметь одинаковые возвращаемый тип и аргументы (посмотреть классы с котами и собаками)
 * 2) Уровень доступа не может быть более ограниченным, чем уровень доступа переопределенного метода. Если методо суперкласса
 * объявлен public, то переопределяемый метод не может быть private или protected
 * 3) Методы, которые объявлены как final не могут быть переопределены
 * 4) Статическкие методы не могут быть ереопределены, но могут быть повторно объявлены
 * 5) Подкласс внутри того же пакета, что и суперкласс экземпляра может переопределить любой метод суперкласса, который не объявлен private или final
 * 6) Подкласс в другом пакете может переопределить только не final методы, объявленные как public или protected
 * 7) Конструкторы нельзя переопределять
 *
 * Перегрузка методов (@Overload).
 * В случае когда методы имеют одинаковые имена, но разные параметры известен как перегрузка методов.
 * */

import java.util.Locale;

public class MyClass100323 {
    public static void main(String[] args) {
        Animal060323 b = new Dog100323();
        Animal060323 a = new Cat060323();
        Animal060323 c = new Animal060323();
        a.makeSound();
        b.makeSound();
        c.makeSound();


        String string = new String();
        string.toLowerCase(Locale.ROOT);
    }

    void myMethod(int a) {

    }
    void myMethod(String a) {

    }
    void myMethod(double a) {

    }


    void sqrt(int a) {

    }
    void sqrt(double a) {

    }
    void sqrt(float a) {

    }
    void sqrt(short a) {

    } // один интерфейс и много методов - полиморфизм. Это у нас перегрузка методов (одинаковые названия с разными типами данных)
}
