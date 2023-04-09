import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1
// +
// 2
// ответ:
// 3
// +
// 4
// ответ:
// 7
// +
// 2
// ответ:
// 9
// 1
// Ответ 8
// Отмена -> 9
// Отмена -> 7
// Отмена -> 3

public class third_task4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        linkedList.add(number);
        while (true) {
            System.out.print("Введите действие (+, -, *, / или напишите 'отмена', чтобы отменить последнюю операцию и 'выход', чтобы выйти): ");
            String symbol = sc.next();

            switch (symbol) {
                case "+":
                    System.out.print("Введите число: ");
                    number = sc.nextInt();
                    System.out.println(linkedList.get(linkedList.size() - 1) + number);
                    linkedList.add(linkedList.get(linkedList.size() - 1) + number);
                    break;
                case "-":
                    System.out.print("Введите число: ");
                    number = sc.nextInt();
                    System.out.println(linkedList.get(linkedList.size() - 1) - number);
                    linkedList.add(linkedList.get(linkedList.size() - 1) - number);
                    break;
                case "*":
                    System.out.print("Введите число: ");
                    number = sc.nextInt();
                    System.out.println(linkedList.get(linkedList.size() - 1) * number);
                    linkedList.add(linkedList.get(linkedList.size() - 1) * number);
                    break;
                case "/":
                    System.out.print("Введите число: ");
                    number = sc.nextInt();
                    System.out.println(linkedList.get(linkedList.size() - 1) / number);
                    linkedList.add(linkedList.get(linkedList.size() - 1) / number);
                    break;
                case "отмена":
                    if (linkedList.size() > 1) {
                        linkedList.removeLast();
                        System.out.println(linkedList.getLast());
                    }
                    else 
                        System.out.println("Осталось только первое число - " + linkedList.getLast());
                    break;
                case "выход":
                    sc.close();
                    return;
            }
        }
    }
}
