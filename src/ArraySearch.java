
import java.util.Objects;
import java.util.Scanner;

public class ArraySearch {
    //
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int find;
        find = 9;
        for (int i = 0; i < number.length; i++) {
            if (find == number[i]) {
                System.out.println("the number is at index: " + i);
            }

        }

        String[] cars = {"Audi", "nissan", "toyota", "bmw", "volwagon", "porche", "mitsubishi", "subaru"};
        String findStr;
        System.out.println("which car? ");
        findStr = s.next();
        for (int x = 0; x < cars.length; x++) {
            if (Objects.equals(findStr, cars[x])) {
                System.out.println("the car is at index: " + x);
            }

        }

        int len = number.length;
        int a = Search(number,0,len,17);
        System.out.println("the number is at " + a);
        
        int[] numberr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int findr;
        findr = 9;

        for (int t = -1; t > 0; t--) {
            if (findr == numberr[t]) {
                System.out.println("the number is at index: " + t);
            }

        }

    }

    static int Search(int [] array, int low, int high , int findBin ){
        int mid;
                mid =(low+high)/2;
                while(low <= high){
            if(mid == findBin){
                return mid;
            } else if (mid< findBin) {
                high = mid+1;
                low = mid;

            }else {
                low = mid - 1;
                high = mid;
            }


        }
        return mid;
    }
}

