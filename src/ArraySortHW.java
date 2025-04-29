public class ArraySortHW {
    // Selection Sort
    public static void selectionSort(int[] arr) {
        int maxInd;
        for (int i = 0; i < arr.length; i++) {
            maxInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxInd] < arr[j]) {
                    maxInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = {2, 1, 4, 5, 8, 7, 0, 3};
        System.out.println("Original Array:");
        printarr(num);
        bubbleSort(num);
        System.out.println("Sorted Array:");
        printarr(num);
    }
}