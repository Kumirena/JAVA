/*
 * Task_1
public class Task_1 {
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
public static void main(String[] args) {

}

public String shuffle(final String s, final int[] index){

    return "";
}
}

 * 
 */



 public class task_2_1 {

    public static void main(String[] args) {

        String s = "cba";
        
        int[] indexes = {3, 2, 1};
        
        System.out.println(shuffle(s, indexes));
    }

    public static String shuffle(final String s, final int[] indexes) {
        
        char[] chars = s.toCharArray();
        
        String result = "";

        for (int i : indexes)
            result += chars[i - 1];

        return result;
    }

}

