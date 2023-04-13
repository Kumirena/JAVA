/*2. Поиск повторяющихся имен и сортировка по убыванию популярности:


                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );
*/
import java.util.*;

public class task5_2 {
    public static void main(String[] args) {
        //List<String> employees = Arrays.asList();  
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
        "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
        "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
        "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
        "Иван Мечников", "Петр Петин", "Иван Ежов"};

Map<String, Integer> nameCount = new HashMap<>();
        for (String emp : employees) {
            String name = emp.split(" ")[0];
            int count = nameCount.getOrDefault(name, 0);
            nameCount.put(name, count + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCount.entrySet());
        Collections.sort(sortedEntries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

