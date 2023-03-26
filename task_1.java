

/*Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. 
Используя данные из массива найдите их кубы.

Sample Input:

8
11
Sample Output:

512
1331*/



import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        int n = 1000;
        long[] cubes = new long[n];
        for (int i = 0; i < n; i++) {
            cubes[i] = (long) Math.pow(i+1, 3);
        }

        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        int b = iScanner.nextInt();

        System.out.println(cubes[a-1]);
        System.out.println(cubes[b-1]);
    }
}