import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class first_task5 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phonebook = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите дейстивие:\n1 - Добавить номер\n2 - Показать весь справочник ");
            int action = sc.nextInt();

            switch (action) {
                case 1:
                    Write(phonebook);
                    break;
                case 2:
                    Read(phonebook);
                    break;
                default:
                    System.out.println("Такого действия нет");
                    return;
            }
        }
    }

    private static void Write(Map<String, ArrayList<String>> phonebook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = sc.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = sc.nextLine();

        if (phonebook.containsKey(surname)) {
            ArrayList<String> temp = phonebook.get(surname);
            temp.add(phoneNumber);
            phonebook.put(surname, temp);
        } else {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(phoneNumber);
            phonebook.put(surname, temp);
        }
    }

    private static void Read(Map<String, ArrayList<String>> phonebook) {
        for (var items : phonebook.entrySet())
            System.out.println(items.getKey() + " " + items.getValue());
    }
}
