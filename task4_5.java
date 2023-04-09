/*
 * 
 * Task_5
import java.util.Deque;
public class Task_5 {
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {

}

public boolean validate(Deque<Integer> deque){

    return false;
}
}


 */

   
    import java.util.Deque;
    import java.util.LinkedList;
     
    public class task4_5 {
     
        public static void main(String[] args) {
            System.out.println(validate("()[]")); // true
            System.out.println(validate("()")); // true
            System.out.println(validate("{[()]}")); // true
            System.out.println(validate("()()")); // true
            System.out.println(validate(")()(")); // false
        }
     
        public static boolean validate(String s){
            Deque<Character> stack = new LinkedList<>();
     
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char top = stack.pop();
                    if((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')){
                        return false;
                    }
                }
            }
     
            return stack.isEmpty();
        }
    }  

