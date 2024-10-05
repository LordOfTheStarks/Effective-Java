package SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 30, 31, 45, 13, 7};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int value : arr) System.out.print(value + " ");
    }
}
