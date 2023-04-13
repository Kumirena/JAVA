/*
 1.	Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/

import java.util.HashMap;
import java.util.Scanner;


public class task5_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();

        System.out.println("Введите имя и телефоны через пробел, либо q для выхода:");

        while (true) {
            String input = iScanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            String[] inputParts = input.split(" ");

            if (inputParts.length < 2) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз.");
                continue;
            }

            String name = inputParts[0];
            String phones = "";

            for (int i = 1; i < inputParts.length; i++) {
                phones += inputParts[i] + ",";
            }

            phones = phones.substring(0, phones.length() - 1); // удаляем последнюю запятую

            if (phoneBook.containsKey(name)) {
                String existingPhones = phoneBook.get(name);
                phoneBook.put(name, existingPhones + ", " + phones);
            } else {
                phoneBook.put(name, phones);
            }

            System.out.println("Данные введены. Чтобы продолжить ввод, введите имя и телефоны, для завершения введите q:");
        }

        System.out.println("Телефонная книга:");
        for (String name : phoneBook.keySet()) {
            String phones = phoneBook.get(name);
            System.out.println(name + ": " + phones);
        }
    }
}





//3. Реализация алгоритма пирамидальной сортировки (HeapSort):

public class HeapSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // if left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // if right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // if largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
*/