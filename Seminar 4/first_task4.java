import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

public class first_task4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 15; i++)
            linkedList.add(random.nextInt(15));
        System.out.println(linkedList);
            
        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        
        for (int i = linkedList.size() - 1; i >= 0; i--)
            reversedList.add(linkedList.get(i));
        System.out.println(reversedList); 
    }
}
