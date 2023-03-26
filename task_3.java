/*
 Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
 */
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        //int n = iScanner.nextInt();
        int n1, n2;
        char operator;
        System.out.printf("Введите первое число: ");
        n1 = iScanner.nextInt();
        System.out.printf("Введите оператор (+,-,*,/): ");
        operator = iScanner.next().charAt(0);
        System.out.printf("Введите второе число: ");
        n2 = iScanner.nextInt();
        switch(operator) {
           case '+':
              System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
              break;
           case '-':
              System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
              break;
           case '*':
              System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
              break;
           case '/':
              System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
              break;
           default:
              System.out.println("Неверный оператор");
              break;
        }
     }
  }