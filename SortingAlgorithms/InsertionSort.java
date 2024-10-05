package SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 30, 31, 45, 13, 7};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int value : arr) System.out.print(value + " ");
    }
}
