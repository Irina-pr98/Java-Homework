import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - 
//     выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий 
//     фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - 
//     сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести 
//     проходящие по условиям.
// Класс сделать в отдельном файле
// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class first_task6 {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Acer", 4, 128, "Windows", "black");
        Notebook notebook2 = new Notebook("Lenovo", 8, 256, "Windows", "silver");
        Notebook notebook3 = new Notebook("HUAWEI", 16, 1024, "Windows", "white");
        Notebook notebook4 = new Notebook("Apple", 16, 512, "macOS", "silver");      
        Notebook notebook5 = new Notebook("Honor", 16, 512, "Windows", "blue");

        Set<Notebook> list = new LinkedHashSet<>(Set.of(notebook1, notebook2, notebook3, notebook4, notebook5));

        choiseNotebook(list, filter());
    }
    
    public static HashMap<String, Object> filter() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> select = new HashMap<String, Object>();
        select.put("RAM", 0);
        select.put("SSD", 0);
        select.put("OS", " ");
        select.put("color", " ");

        System.out.print("\nВведите цифру, соответствующую необходимому критерию: ");
        
        while(true) {
            System.out.print("\n1 - Оперативная память");
            System.out.print("\n2 - Объем жесткого диска");
            System.out.print("\n3 - Операционная система");
            System.out.print("\n4 - Цвет");
            System.out.println("\n5 - Завершить подбор");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите минимальный объем оперативной памяти: ");
                    int ram = sc.nextInt();
                    select.put("RAM", ram);
                    break;

                case 2:
                    System.out.print("Введите минимальный объем жесткого диска: ");
                    int ssd = sc.nextInt();
                    select.put("SSD", ssd);
                    break;

                case 3:
                    System.out.print("Выберите операционную систему: ");
                    System.out.print("\n1 - MacOs");
                    System.out.println("\n2 - Windows");
                    int choiceOs = sc.nextInt();
                    switch (choiceOs) {
                        case 1:
                            select.put("OS", "macOs");
                            break;

                        case 2:
                            select.put("OS", "Windows");
                            break;
                    
                        default:
                            System.out.println("Ошибка");
                            break;
                    }
                    break;

                case 4:
                    System.out.print("Выберите цвет: ");
                    System.out.print("\n1 - Серебряный");
                    System.out.print("\n2 - Черный");
                    System.out.print("\n3 - Белый");
                    System.out.println("\n4 - Синий");
                    int choiceColor = sc.nextInt();
                    switch (choiceColor) {
                        case 1:
                            select.put("color", "silver");
                            break;

                        case 2:
                            select.put("color", "black");
                            break;

                        case 3:
                            select.put("color", "white");
                            break;

                        case 4:
                            select.put("color", "blue");
                            break;
                    
                        default:
                            System.out.println("Ошибка");
                            break;
                    }
                    break;

                case 5:
                    sc.close();
                    return select;
            
                default:
                    System.out.println("Ошибка");
                    break;
            }
        }
    }

    public static void choiseNotebook(Set<Notebook> list, HashMap<String, Object> filter) {
        ArrayList<Notebook> result = new ArrayList<>();

        for(Notebook element : list) {
            if (element.getRam() >= (Integer) filter.get("RAM") && element.getSsd() >= (Integer) filter.get("SSD") && (element.getOs().equals((String) filter.get("OS")) || filter.get("OS").equals("result")) && (element.getColor().equals((String) filter.get("color")) || filter.get("color").equals("")))
                result.add(element);
        }

        if (result.size() == 0)
            System.out.println("Ноутбук не найден");
        else {
            System.out.println("Под выбранные параметры подойдут ноутбуки: ");
            for (int i = 0; i < result.size(); i++)
                System.out.println(result.get(i));
        }
    }
}