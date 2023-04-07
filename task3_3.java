
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class task3_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println("<e>="+averege(list));
        System.out.println("min="+Collections.min(list));  
        System.out.println("max="+Collections.max(list));     
    } 
    public static int averege(List<Integer> list){
        int l = list.size();
        int sum = 0;
        for(Integer i: list){
         sum += i;
        }
        int ave =  sum / l;
        return (ave);     
     }
 }
    
