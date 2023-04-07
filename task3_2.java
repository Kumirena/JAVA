
/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class task3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(removeEvenValue(list));
    }
// Нужно удалить из него четные числа
public static List<Integer> removeEvenValue(List<Integer> list){
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) % 2 == 0) {
        list.remove(i);
        i--;
        }
    }
        System.out.println(list);
        return new ArrayList<>();
}
}


