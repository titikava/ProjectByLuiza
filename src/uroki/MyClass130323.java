package uroki;


/*
!!!!!!!!!!!!!!!!!!!!!!!!Абстракция!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Абстракция данных предоставляет внешнему миру только основную информацию, т.е. только главные особенности, не включая детали реализации.
В Java абстракция достигается с помощью абстрактных классов и интерфейсов. Концепцией абстракции является то, что мы фокусируемся на основных
характеристиках, а не на специфических характеристиках одного отдельного примера.
Абстрактный класс определяется с помощью ключевого слова abstract.
1. Если объявленный клас является абстрактным, то он не может инстанцироваться (не можем создавать объекты этого класса/типа).
2. Что бы использовать абстрактный класс необходимо наследовать его от другого класса.
3. Любой класс содержащий абстрактный метод должен быть определен как абстрактный.
Абстрактный метод - это метод, который объявлен без реализации (без фигурных скобок, заканчивается точкой с запятой).
Если наш класс наследуется от абстрактного класса, то мы должны переопределить все абстрактные методы этого класса.
!!!!!!!!!!!!!!!!!!!!!!!!!Интерфейсы!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Интерфейс - это полностью абстрактный класс, который содержит только аббстрактные методы.
Некоторые спецификации для интерфейса:
1. Определяется с помощью ключевого слова interface.
2. Могут содержать только static final переменные.
3. Не могут содержать конструктор, потому что интерфейсы не могут инстанцироваться.
4. Класс может реализовывать любое кол-во интерфейсов
Интерфейсы имеют следующие свойства:
1. Интерфейс является полностью абстрактным (не нужно использовать ключевое слово abstract при объявлении интерфейса)
2. Каждый метод в интерфейсе абстрактный. Не нужно использовать ключевое слово abstract.
3. Методы в интерфейсе является полностью публичные

!!!!!!!!!!!!Класс может наследоваться лишь от одного суперкласса, но может реализовывать множество интерфейсов!!!!!

!!!!!!!!!!!!При использовании интерфейса вам необходимо переопределить ВСЕ его методы!!!!!!!!!!!
 */

public class MyClass130323 {

}
