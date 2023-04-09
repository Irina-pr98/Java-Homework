import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class second_task4 {
    public static void main(String[] args) {
        LinkedList<Integer> element = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            enqueue(element, getRandomNumber());
        System.out.println(element);

        System.out.println(dequeue(element));
        System.out.println(element);

        System.out.println(first(element));
        System.out.println(element);
    }

    public static int getRandomNumber() {
        double num = (Math.random() * 99);
        int number = (int) num;
        return number;
    }

    public static void enqueue(LinkedList<Integer> element, int number) {
        element.addLast(number);
    }
        
    public static int dequeue(LinkedList<Integer> element) {
        int number = element.get(0);
        element.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> element) {
        int number = element.get(0);
        return number;
    }
}
