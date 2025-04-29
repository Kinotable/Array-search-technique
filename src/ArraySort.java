import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        // int[] numbers = { 5, 2, 8, 1, 9 };
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = { 5, 2, 8, 1, 9 };
        int[] sortedNumbers = manualSort(numbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public static int[] manualSort(int[] arr) {
        int[] sortedArr = new int[arr.length];
        // Copy original array elements to sortedArr
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

        for (int i = 0; i < sortedArr.length - 1; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }
        return sortedArr;
    }
}
