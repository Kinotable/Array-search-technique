import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int len = number.length;
        System.out.println("search for this number : ");
        int Search4 = s.nextInt();

        int a = dividenrule(number, 0, len, Search4);
        System.out.println("the number is at " + a);

    }
    static int dividenrule(int[] array, int start, int end, int search4) {
        int center = (start + end) / 2;
        int index = 0;
        // Search in the first half
        for (int i = start; i < center; i++) {
            if (array[i] == search4) {
                index = i ; // Return the index if found
            }
        }
        // Search in the second half
        for (int i = center; i < end; i++) {
            if (array[i] == search4) {
                index = i ; // Return the index if found
            }
        }
        return index;
    }





    /*static int Search(int[] array, int low, int high, int findBin) {
        int mid;
        mid = (low + high) / 2;
        while (low <= high) {
            System.err.println("im in the loop");
            if (mid == findBin) {
                return mid;
            } else if (mid < findBin) {
                high = mid + 1;
                low = mid;

            } else {
                low = mid - 1;
                high = mid;
            }

        }
        return mid;
    }*/

}
