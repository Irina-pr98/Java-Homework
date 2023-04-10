import static java.util.Collections.reverseOrder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class second_task5 {
    public static void main(String[] args) {
        Map<String, Integer> dict = new HashMap<>();
        Map<Object, Object> countDict = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова" ,"Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        for (String name : list) {
            if (dict.containsKey(Array.get(name.split(" "), 0))) {
                int index = dict.get(Array.get(name.split(" "), 0));
                dict.put((String) Array.get(name.split(" "), 0), index + 1);
            } else
                dict.put((String) Array.get(name.split(" "), 0), 1);
        }
        countDict  = dict.entrySet().stream().sorted(reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
                                                    
        for (var item : countDict.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
