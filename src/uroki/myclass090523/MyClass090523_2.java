package uroki.myclass090523;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Scanner;

/*-----------------------------------РАБОТА С ФАЙЛАМИ---------------------------
Пакет java.io включает себя класс File, который позволяет работать с файлами. Что бы начать создайте файл и укажите путь
к нему в конструкторе.
Методы класса File:
1. exists() - показывает существует ли файл true/false
2. getName() - возвращает название файла


----------------------------------------Чтение файла-------------------------------------
Одним из способов чтения файла является использование класса Scanner из пакета java.util. Конструктор класса Scanner может
принимать объект File в качестве ввода. Scanner наследуется от класса Iterator. Ведет себя похожим образом. Мы можем
использовать метод next() для чтения содержимого файла. Содержимое файла будет выводиться слово за словом, потому что
next() возвращает каждое слово отдельно.
Закрывать файл после завершения работы с ним всегда является хорошей практикой. Одним из способов - метод close();


----------------------------------СОЗДАНИЕ ФАЙЛОВ--------------------------
Formatter - другой полезный класс в пакете java.util используется для создания содержимого и записи его в файл.
Formatter f = new Formatter("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\Для жавы.txt"); - таким образом создается пустой файл
по указанному пути. Если файл уже существует, то он будет ппереписан. После того как файл был создан мы можем записать
содержимое в него используя метод format()
\r\n - символ новой строки в Windows

--------------------------------------Ввод в консоль
BufferedReader
* */
public class MyClass090523_2 {

    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\Для жавы.txt");
//        if (file.exists()) {
//            System.out.println(file.getName() + " exists");
//        } else {
//            System.out.println("file не найден братик");
//            file.createNewFile();
//        }
//        File file2 = new File("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\Для жав2ы.jpeg");
//        file2.createNewFile();

//        Scanner sc = new Scanner(file);
//        while (sc.hasNext()) {
//            System.out.println(sc.next());
//        }
//        sc.close();
        try {
            Formatter f = new Formatter("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\Для жавы.txt");
            f.format("%s %s %s", "1", "John", "Smit");
            f.close();
            Formatter f2 = new Formatter("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\Для жав2ы.txt");
            f2.format("%s", "1skdmaslkmdals asdasd asd \r\n 32r fgfdgdf4 gdfg ef");
            f2.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите кол-во элементов массива");
        int n;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + i + " элемент массива");
                arr[i] = Integer.parseInt(bufferedReader.readLine());
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}