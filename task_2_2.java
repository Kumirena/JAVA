/*
 * Task_2
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

 */

 import java.util.Scanner;

public class task_2_2 {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите число строк в книге: ");
        int n = iScanner.nextInt();//строки книги
        iScanner.nextLine(); 
        String[] cookerybook = new String[n];
        for (int i = 0; i < n; i++) {
            cookerybook[i] = iScanner.nextLine();
        }
        System.out.printf("Введите количество строк с продуктами: ");
        int m = iScanner.nextInt();//количество продуктов
        iScanner.nextLine(); 
        String[] product = new String[m];
        String[] replacements = new String[m];
        
        for (int i = 0; i < m; i++) {
            System.out.printf("Продукты, которые нужно заменить: " + (i + 1) + ": ");
                String[] parts = iScanner.nextLine().split(" - ");
                product[i] = parts[0];
                replacements[i] = parts[1];
            }
           
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cookerybook[i] = cookerybook[i].replaceAll("\\b" + product[j] + "\\b", replacements[j]);
                cookerybook[i] = cookerybook[i].replaceAll("\\b" + product[j].substring(0, 1).toUpperCase() + product[j].substring(1) + "\\b", replacements[j].substring(0, 1).toUpperCase() + replacements[j].substring(1));
            }
            System.out.println(cookerybook[i]);
        }
    }
}
