import java.util.Scanner;

public class MathamaticalOp{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double num;
        int choice;
        System.out.println("enter the following number for the following operation needed, 1=cube root ,2=squareroot,3=absolute value , 4=round up, 5=round down");
        choice = s.nextInt();
        if (choice == 1){
            System.out.println("you have chosen cube root, enter the number below,");
            num = s.nextInt();
            System.out.println(Math.cbrt(num));

        }
        else if (choice == 2) {
            System.out.println("you have chosen square root, enter the number below,");
            num = s.nextInt();
            System.out.println(Math.sqrt(num));

            
        }
        else if (choice == 3) {
            System.out.println("you have chosen absolute value, enter the number below,");
            num = s.nextInt();
            System.out.println(Math.abs(num));

            
        }
        else if (choice == 4) {
            System.out.println("you have chosen roundup, enter the number below,");
            num = s.nextInt();
            System.out.println(Math.ceil(num));
        }
        else if (choice == 5) {
            System.out.println("you have chosen round down, enter the number below,");
            num = s.nextInt();
            System.out.println(Math.floor(num));

            
        }
        else{
            System.out.println("error try again");
        }


    }
}