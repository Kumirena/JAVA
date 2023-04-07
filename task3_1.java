/*
 * 1.	Реализовать алгоритм сортировки слиянием и выборкой
 */




    import java.util.Arrays;
    import java.util.Scanner;
        
        public class task3_1 {
          public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
                System.out.print("Введите размер массива: ");
                int n = Scanner.nextInt();
        
                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = (int) (Math.random() * 100);
                }
        
                System.out.println("Массив: " + Arrays.toString(array));
        
                // сортировка выборкой
                selectionSort(array);
                System.out.println("Массив после сортировки выборкой: " + Arrays.toString(array));
        
            }
        
            
            public static void selectionSort(int[] array) {
                int n = array.length;
                for (int i = 0; i < n - 1; i++) {
                    int min_index = i;
                    for (int j = i + 1; j < n; j++) {
                        if (array[j] < array[min_index]) {
                            min_index = j;
                        }
                    }
                    int temp = array[min_index];
                    array[min_index] = array[i];
                    array[i] = temp;
                }
            }
        
            //сортировка слиянием
            

            public static void mergeSort(int[] array, int l, int r) {
                if (l < r) {
                    int m = (l + r) / 2;
        
                    mergeSort(array, l, m);
                    mergeSort(array, m + 1, r);
        
                    merge(array, l, m, r);
                }
                
            }
            public static void merge(int[] array, int l, int m, int r) {
                int n1 = m - l + 1;
                int n2 = r - m;
        
                int[] L = new int[n1];
                int[] R = new int[n2];
        
                for (int i = 0; i < n1; i++) {
                    L[i] = array[l + i];
                }
                for (int j = 0; j < n2; j++) {
                    R[j] = array[m + 1 + j];
                }
        
                int i = 0, j = 0, k = l;
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                        array[k] = L[i];
                        i++;
                    } else {
                        array[k] = R[j];
                        j++;
                    }
                    k++;
                }
        
                while (i < n1) {
                    array[k] = L[i];
                    i++;
                    k++;
                }
        
                while (j < n2) {
                    array[k] = R[j];
                    j++;
                    k++;
                }
                mergeSort(array, 0, array.length - 1);
                System.out.println("Массив после сортировки слиянием: " + Arrays.toString(array));
         
                
    }
    
}
