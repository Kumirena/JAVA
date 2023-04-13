
//1.	Реализовать алгоритм пирамидальной сортировки (HeapSort).



public class task5_3 {
    public static void main(String[] args) {
        int[] Array = {6, 2, 4, 9, 10, 5, -1};
        HeapSort(Array);
        for(int i = 0; i <Array.length;i++)
            System.out.print(Array[i]+" ");
    }

    private static void HeapSort(int [] arr){
        int n = arr.length;
        for(int i= n/2-1; i >=0; i--)
            heapify(arr , i, n);
        for (int i = n-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] =temp;
            heapify(arr, 0, i);
        }
    }
    private static void heapify(int[] arr, int i, int n){
        int l =i * 2 + 1;
        int r =i * 2 + 2;
        int largest = i;
        if (l<n && arr[l]> arr[largest])
            largest= l;
        if (r<n && arr[r]> arr[largest])
            largest= r;
        if (i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] =temp;
            heapify(arr, largest, n);
        }

    }
}