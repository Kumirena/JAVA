
/*
 Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

Sample Input:

4
1
2
3
5
2
Sample Output:

2
4
6
10
 */
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = iScanner.nextInt();
        }
        int multiplier = iScanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] * multiplier);
        }
    }
}

