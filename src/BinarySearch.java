
public class BinarySearch {
    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int len = number.length -1;
        int a = Search(number, 0, len, 9);
        System.out.println("the number is at " + a);

    }

    static int Search(int[] array, int low, int high, int findBin) {
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
    }

}
