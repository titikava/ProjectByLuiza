package precticeWithArray;

import hotelWorksClient.Client;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork2605 {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
    }

    static void task1() {
//        Создать ArrayList из чисел.
        ArrayList<Integer> array1 = new ArrayList<>();
//        Заполнить 10 значениями.
        array1.add(4);
        array1.add(6);
        array1.add(8);
        array1.add(34);
        array1.add(13);
        array1.add(1);
        array1.add(2);
        array1.add(67);
        array1.add(98);
        array1.add(143);
//        Вывести на экран размер списка.
        System.out.println("Размер массива: " + array1.size());
//        Вывести содержимое списка циклом через пробел.
        System.out.println("Массив состоит из: ");
        int i = 0;
        while (i < array1.size()) {
            System.out.print(array1.get(i) + " ");
            i++;
        }
        System.out.println("\n");
//        Удалить первые 4 элемента.
        for(int k = 0; k<4; k++){
            array1.remove(0);
        }
//        array1.remove(0);
//        array1.remove(1);
//        array1.remove(2);
//        array1.remove(3);
//        Вывести размер списка
        System.out.println("Размер массива: " + array1.size());
//        Отсортировать список по возрастанию элементов 2 способами: используя Collections.sort(list)(изучить), и использую цикл.
//        Collections.sort(array1);
//ДОДЕЛАТЬ! 0 12 2 54 3
        for (int j = 0; j < array1.size() - 1; j++) {
            for (int k =j + 1; k < array1.size(); k++){
                if (array1.get(j) > array1.get(k)) {
                    int x = array1.get(j);
                    array1.set(j, array1.get(k));
                    array1.set(k, x);
                }
            }
        }
        System.out.println("Отсортированный массив" + array1);
    }
    static void task2() {
//        Создать список из 5 строк, в которых указаны названия фруктов.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Абрикос");
        fruits.add("Яблоко");
        fruits.add("Банана");
        fruits.add("Груша");
        fruits.add("Лимон");
//        Добавить элемент на 0 позицию «ананас»
        fruits.add(0, "Ананас");
//        Вывести список на экран
        System.out.println("Создали список фруктов: " + fruits);
//        Создать список из овощей (5 шт)
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Томато");
        vegetables.add("Огурчелло");
        vegetables.add("Лука");
        vegetables.add("Гранд Чеснокко");
        vegetables.add("Фу Перец-болгарин");
//        Добавить все элементы списка овощей в список фруктов с 1 позиции.
        fruits.addAll(1, vegetables);
//        Вывести список на экран
        System.out.println("Добавили овощей: " + fruits);
//        Создать копию списка используя clone.
        ArrayList<String> fruitsClone = (ArrayList<String>) fruits.clone();
//        Вывести клонированный список на экран
        System.out.println("Клонированный список: " + fruitsClone);
//        Очистить первый список
        fruits.clear();
//        Вывести на экран длину первого списка
        System.out.println("Длина первого списка: " + fruits.size());
//        Вывести на экран значение содержит ли клонированный список элемент «ананас» (true/false)
        System.out.println(fruitsClone.contains("Ананас"));
    }


    static void task3() {
//        Создать список1 из 4 Клиентов. (Анна, Антон, Алексей, Алёна)
        ArrayList<Client> clients1 = new ArrayList<>();
        clients1.add(new Client("Анна", "Веревочкина", 22));
        clients1.add(new Client("Антон", "Гладиолус", 35));
        clients1.add(new Client("Алексей", "Пятница", 66));
        clients1.add(new Client("Алёна", "Дэнс", 18));
//        Вывести на экран индекс клиента Алексея.
        for (Client client : clients1){
            if (client.getName().equals("Алексей")){
                System.out.println("Индекс клиента Алексея: " + clients1.indexOf(client));
            }
        }
//        System.out.println("Индекс клиента Алексея: " + clients1.indexOf(new Client("Алексей", "Пятница", 66)));
//        Вывести на экран элемент, находящийся на позиции 2.
        System.out.println("Клиент на позиции 2: " + clients1.get(2));
//        Добавить ещё одного клиента «Федор»
        clients1.add(new Client("Федор", "Мучачо", 44));
//        Проверить пустой ли список1. Вывести значение (true/false)
        System.out.println("Список клиентов пуст? -  " + clients1.isEmpty());
//        Создать список2 из 2 клиентов (Иван, Илья)
        ArrayList<Client> clients2 = new ArrayList<>();
        clients2.add(new Client("Иван", "Оралби", 19));
        clients2.add(new Client("Илья", "Мармелад", 44));
//        Добавить список2 к имеющемуся
        clients1.addAll(clients2);
//        Вывести список1 на экран. В полном виде.
        System.out.println("Список 1 в полном виде: " + clients1);
//        Вывести список1 на экран, только имена клиентов.
        System.out.print("Имена клиентов: ");
        for (Client client : clients1) {
            System.out.print(client.getName() + "; ");
        }
        System.out.println("\n");
//        Удалить список2 из списка1.
        clients1.removeAll(clients2);
//        Вывести на экран список1
        System.out.println("Список 1 после удаления: " + clients1);
//        Заменить элемент на позиции 1 на клиента (Юля). (set)
        clients1.set(0, new Client("Юля", "Пуля", 41));
//        Вывести на экран
        System.out.println("Инфа о клиенте на позиции 1: " + clients1.get(0));
        System.out.println(clients1);
    }
}
